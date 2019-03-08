package com.lijianmin.util;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Author: jianmin.li
 * @Description: 导出excel工具类
 * @Date: 2019/3/8 21:45
 * @Version: 1.0
 */
public class ExcelUtils {
    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);
    /**
     * 每张sheet的最大数据行数，如果有标题，为10w行
     */
    private static final Integer MAX_SHEET_COUNT = 99999;
    private static final String EXCEL_EXTENSION = "xlsx";

    /**
     * 导出Excel
     *
     * @param request  请求域
     * @param response 响应域
     * @param list     导出数据->至少要有一个元素
     * @param clazz    数据类型
     * @Author: jianmin.li
     * @Date: 2019/3/8 21:50
     * @return: void
     */
    public static void exportExcel(HttpServletRequest request,HttpServletResponse response,List<? extends BaseRowModel>
            list,Class<? extends BaseRowModel> clazz,String filename) {
        Assert.notNull(filename,"The filename must not be null !");
        if (!EXCEL_EXTENSION.equals(FilenameUtils.getExtension(filename))) {
            throw new RuntimeException("The filename's extension must be 'xlsx'");
        }
        if (CollectionUtils.isEmpty(list)) {
            throw new NullPointerException("The list must have at least one element");
        }
        int size = list.size();
        int merchant = size / MAX_SHEET_COUNT;
        int remainder = size % MAX_SHEET_COUNT;
        BufferedOutputStream out = null;
        ExcelWriter writer = new ExcelWriter(out,ExcelTypeEnum.XLSX,true);
        try {
            setResponse(request,response,filename);
            out = new BufferedOutputStream(response.getOutputStream());
            for (int i = 0; i < merchant; i++) {
                List<? extends BaseRowModel> baseRowModels = list.subList(i * MAX_SHEET_COUNT,(i + 1) *
                        MAX_SHEET_COUNT);
                Sheet sheet = new Sheet(i + 1,0,clazz);
                sheet.setSheetName("Sheet" + (i + 1));
                writer.write(baseRowModels,sheet);
            }
            if (remainder > 0) {
                List<? extends BaseRowModel> baseRowModels = list.subList(size - remainder,size);
                list = null;
                Sheet sheet = new Sheet(merchant + 1,0,clazz);
                sheet.setSheetName("Sheet" + (merchant + 1));
                writer.write(baseRowModels,sheet);
            }
        } catch (IOException e) {
            log.error("An IOException occurred while exporting the Excel!",e);
        } finally {
            writer.finish();
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static void setResponse(HttpServletRequest request,HttpServletResponse response,String filename) throws
            IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType(ContentTypeUtils.getContentType(EXCEL_EXTENSION));
        response.setHeader("Content-Disposition","attachment;filename=" + FileUtils.encodeDownloadFilename(filename,
                request.getHeader("User-Agent")));
    }
}
