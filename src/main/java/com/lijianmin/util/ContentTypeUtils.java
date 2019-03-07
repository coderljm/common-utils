package com.lijianmin.util;

/**
 * @类说明：文件类型工具类
 * @author itw_lijm01
 * @date 2018年3月7日 上午10:28:01
 * @version [版本号，默认V1.0.0]
 * @since
 */
public class ContentTypeUtils {

	/**
	 * 描述：〈根据文件扩展名获取文件类型〉
	 * 
	 * @param extension---文件后缀名（如：doc、xlsx）
	 * @return String---文件类型
	 * @author itw_lijm01
	 * @Credited 2018年3月7日 上午10:29:40
	 * @version [版本号，默认V1.0.0]
	 */
	public static String getContentType(String extension) {
		extension = extension.toLowerCase();
		// 根据后缀获取相应的文件类型
		if ("123".equals(extension)) {
			return "application/vnd.lotus-1-2-3";
		}
		if ("3dml".equals(extension)) {
			return "text/vnd.in3d.3dml";
		}
		if ("3ds".equals(extension)) {
			return "image/x-3ds";
		}
		if ("3g2".equals(extension)) {
			return "video/3gpp2";
		}
		if ("3gp".equals(extension)) {
			return "video/3gpp";
		}
		if ("7z".equals(extension)) {
			return "application/x-7z-compressed";
		}
		if ("aab".equals(extension)) {
			return "application/x-authorware-bin";
		}
		if ("aac".equals(extension)) {
			return "audio/x-aac";
		}
		if ("aam".equals(extension)) {
			return "application/x-authorware-map";
		}
		if ("aas".equals(extension)) {
			return "application/x-authorware-seg";
		}
		if ("abs".equals(extension)) {
			return "audio/x-mpeg";
		}
		if ("abw".equals(extension)) {
			return "application/x-abiword";
		}
		if ("ac".equals(extension)) {
			return "application/pkix-attr-cert";
		}
		if ("acc".equals(extension)) {
			return "application/vnd.americandynamics.acc";
		}
		if ("ace".equals(extension)) {
			return "application/x-ace-compressed";
		}
		if ("acu".equals(extension)) {
			return "application/vnd.acucobol";
		}
		if ("acutc".equals(extension)) {
			return "application/vnd.acucorp";
		}
		if ("adp".equals(extension)) {
			return "audio/adpcm";
		}
		if ("aep".equals(extension)) {
			return "application/vnd.audiograph";
		}
		if ("afm".equals(extension)) {
			return "application/x-font-type1";
		}
		if ("afp".equals(extension)) {
			return "application/vnd.ibm.modcap";
		}
		if ("ahead".equals(extension)) {
			return "application/vnd.ahead.space";
		}
		if ("ai".equals(extension)) {
			return "application/postscript";
		}
		if ("aif".equals(extension)) {
			return "audio/x-aiff";
		}
		if ("aifc".equals(extension)) {
			return "audio/x-aiff";
		}
		if ("aiff".equals(extension)) {
			return "audio/x-aiff";
		}
		if ("aim".equals(extension)) {
			return "application/x-aim";
		}
		if ("air".equals(extension)) {
			return "application/vnd.adobe.air-application-installer-package+zip";
		}
		if ("ait".equals(extension)) {
			return "application/vnd.dvb.ait";
		}
		if ("ami".equals(extension)) {
			return "application/vnd.amiga.ami";
		}
		if ("anx".equals(extension)) {
			return "application/annodex";
		}
		if ("apk".equals(extension)) {
			return "application/vnd.android.package-archive";
		}
		if ("appcache".equals(extension)) {
			return "text/cache-manifest";
		}
		if ("application".equals(extension)) {
			return "application/x-ms-application";
		}
		if ("apr".equals(extension)) {
			return "application/vnd.lotus-approach";
		}
		if ("arc".equals(extension)) {
			return "application/x-freearc";
		}
		if ("art".equals(extension)) {
			return "image/x-jg";
		}
		if ("asc".equals(extension)) {
			return "application/pgp-signature";
		}
		if ("asf".equals(extension)) {
			return "video/x-ms-asf";
		}
		if ("asm".equals(extension)) {
			return "text/x-asm";
		}
		if ("aso".equals(extension)) {
			return "application/vnd.accpac.simply.aso";
		}
		if ("asx".equals(extension)) {
			return "video/x-ms-asf";
		}
		if ("atc".equals(extension)) {
			return "application/vnd.acucorp";
		}
		if ("atom".equals(extension)) {
			return "application/atom+xml";
		}
		if ("atomcat".equals(extension)) {
			return "application/atomcat+xml";
		}
		if ("atomsvc".equals(extension)) {
			return "application/atomsvc+xml";
		}
		if ("atx".equals(extension)) {
			return "application/vnd.antix.game-component";
		}
		if ("au".equals(extension)) {
			return "audio/basic";
		}
		if ("avi".equals(extension)) {
			return "video/x-msvideo";
		}
		if ("avx".equals(extension)) {
			return "video/x-rad-screenplay";
		}
		if ("aw".equals(extension)) {
			return "application/applixware";
		}
		if ("axa".equals(extension)) {
			return "audio/annodex";
		}
		if ("axv".equals(extension)) {
			return "video/annodex";
		}
		if ("azf".equals(extension)) {
			return "application/vnd.airzip.filesecure.azf";
		}
		if ("azs".equals(extension)) {
			return "application/vnd.airzip.filesecure.azs";
		}
		if ("azw".equals(extension)) {
			return "application/vnd.amazon.ebook";
		}
		if ("bat".equals(extension)) {
			return "application/x-msdownload";
		}
		if ("bcpio".equals(extension)) {
			return "application/x-bcpio";
		}
		if ("bdf".equals(extension)) {
			return "application/x-font-bdf";
		}
		if ("bdm".equals(extension)) {
			return "application/vnd.syncml.dm+wbxml";
		}
		if ("bed".equals(extension)) {
			return "application/vnd.realvnc.bed";
		}
		if ("bh2".equals(extension)) {
			return "application/vnd.fujitsu.oasysprs";
		}
		if ("bin".equals(extension)) {
			return "application/octet-stream";
		}
		if ("blb".equals(extension)) {
			return "application/x-blorb";
		}
		if ("blorb".equals(extension)) {
			return "application/x-blorb";
		}
		if ("bmi".equals(extension)) {
			return "application/vnd.bmi";
		}
		if ("bmp".equals(extension)) {
			return "image/bmp";
		}
		if ("body".equals(extension)) {
			return "text/html";
		}
		if ("book".equals(extension)) {
			return "application/vnd.framemaker";
		}
		if ("box".equals(extension)) {
			return "application/vnd.previewsystems.box";
		}
		if ("boz".equals(extension)) {
			return "application/x-bzip2";
		}
		if ("bpk".equals(extension)) {
			return "application/octet-stream";
		}
		if ("btif".equals(extension)) {
			return "image/prs.btif";
		}
		if ("bz".equals(extension)) {
			return "application/x-bzip";
		}
		if ("bz2".equals(extension)) {
			return "application/x-bzip2";
		}
		if ("c".equals(extension)) {
			return "text/x-c";
		}
		if ("c11amc".equals(extension)) {
			return "application/vnd.cluetrust.cartomobile-config";
		}

		if ("c11amz".equals(extension)) {
			return "application/vnd.cluetrust.cartomobile-config-pkg";
		}

		if ("c4d".equals(extension)) {
			return "application/vnd.clonk.c4group";
		}

		if ("c4f".equals(extension)) {
			return "application/vnd.clonk.c4group";
		}

		if ("c4g".equals(extension)) {
			return "application/vnd.clonk.c4group";
		}

		if ("c4p".equals(extension)) {
			return "application/vnd.clonk.c4group";
		}

		if ("c4u".equals(extension)) {
			return "application/vnd.clonk.c4group";
		}

		if ("cab".equals(extension)) {
			return "application/vnd.ms-cab-compressed";
		}

		if ("caf".equals(extension)) {
			return "audio/x-caf";
		}

		if ("cap".equals(extension)) {
			return "application/vnd.tcpdump.pcap";
		}

		if ("car".equals(extension)) {
			return "application/vnd.curl.car";
		}

		if ("cat".equals(extension)) {
			return "application/vnd.ms-pki.seccat";
		}

		if ("cb7".equals(extension)) {
			return "application/x-cbr";
		}

		if ("cba".equals(extension)) {
			return "application/x-cbr";
		}

		if ("cbr".equals(extension)) {
			return "application/x-cbr";
		}

		if ("cbt".equals(extension)) {
			return "application/x-cbr";
		}

		if ("cbz".equals(extension)) {
			return "application/x-cbr";
		}

		if ("cc".equals(extension)) {
			return "text/x-c";
		}

		if ("cct".equals(extension)) {
			return "application/x-director";
		}

		if ("ccxml".equals(extension)) {
			return "application/ccxml+xml";
		}

		if ("cdbcmsg".equals(extension)) {
			return "application/vnd.contact.cmsg";
		}

		if ("cdf".equals(extension)) {
			return "application/x-cdf";
		}

		if ("cdkey".equals(extension)) {
			return "application/vnd.mediastation.cdkey";
		}

		if ("cdmia".equals(extension)) {
			return "application/cdmi-capability";
		}

		if ("cdmic".equals(extension)) {
			return "application/cdmi-container";
		}

		if ("cdmid".equals(extension)) {
			return "application/cdmi-domain";
		}

		if ("cdmio".equals(extension)) {
			return "application/cdmi-object";
		}

		if ("cdmiq".equals(extension)) {
			return "application/cdmi-queue";
		}

		if ("cdx".equals(extension)) {
			return "chemical/x-cdx";
		}

		if ("cdxml".equals(extension)) {
			return "application/vnd.chemdraw+xml";
		}

		if ("cdy".equals(extension)) {
			return "application/vnd.cinderella";
		}

		if ("cer".equals(extension)) {
			return "application/pkix-cert";
		}

		if ("cfs".equals(extension)) {
			return "application/x-cfs-compressed";
		}

		if ("cgm".equals(extension)) {
			return "image/cgm";
		}

		if ("chat".equals(extension)) {
			return "application/x-chat";
		}

		if ("chm".equals(extension)) {
			return "application/vnd.ms-htmlhelp";
		}

		if ("chrt".equals(extension)) {
			return "application/vnd.kde.kchart";
		}

		if ("cif".equals(extension)) {
			return "chemical/x-cif";
		}

		if ("cii".equals(extension)) {
			return "application/vnd.anser-web-certificate-issue-initiation";
		}

		if ("cil".equals(extension)) {
			return "application/vnd.ms-artgalry";
		}

		if ("cla".equals(extension)) {
			return "application/vnd.claymore";
		}

		if ("class".equals(extension)) {
			return "application/java";
		}

		if ("clkk".equals(extension)) {
			return "application/vnd.crick.clicker.keyboard";
		}

		if ("clkp".equals(extension)) {
			return "application/vnd.crick.clicker.palette";
		}

		if ("clkt".equals(extension)) {
			return "application/vnd.crick.clicker.template";
		}

		if ("clkw".equals(extension)) {
			return "application/vnd.crick.clicker.wordbank";
		}

		if ("clkx".equals(extension)) {
			return "application/vnd.crick.clicker";
		}

		if ("clp".equals(extension)) {
			return "application/x-msclip";
		}

		if ("cmc".equals(extension)) {
			return "application/vnd.cosmocaller";
		}

		if ("cmdf".equals(extension)) {
			return "chemical/x-cmdf";
		}

		if ("cml".equals(extension)) {
			return "chemical/x-cml";
		}

		if ("cmp".equals(extension)) {
			return "application/vnd.yellowriver-custom-menu";
		}

		if ("cmx".equals(extension)) {
			return "image/x-cmx";
		}

		if ("cod".equals(extension)) {
			return "application/vnd.rim.cod";
		}

		if ("com".equals(extension)) {
			return "application/x-msdownload";
		}

		if ("conf".equals(extension)) {
			return "text/plain";
		}

		if ("cpio".equals(extension)) {
			return "application/x-cpio";
		}

		if ("cpp".equals(extension)) {
			return "text/x-c";
		}

		if ("cpt".equals(extension)) {
			return "application/mac-compactpro";
		}

		if ("crd".equals(extension)) {
			return "application/x-mscardfile";
		}

		if ("crl".equals(extension)) {
			return "application/pkix-crl";
		}

		if ("crt".equals(extension)) {
			return "application/x-x509-ca-cert";
		}

		if ("cryptonote".equals(extension)) {
			return "application/vnd.rig.cryptonote";
		}

		if ("csh".equals(extension)) {
			return "application/x-csh";
		}

		if ("csml".equals(extension)) {
			return "chemical/x-csml";
		}

		if ("csp".equals(extension)) {
			return "application/vnd.commonspace";
		}

		if ("css".equals(extension)) {
			return "text/css";
		}

		if ("cst".equals(extension)) {
			return "application/x-director";
		}

		if ("csv".equals(extension)) {
			return "text/csv";
		}

		if ("cu".equals(extension)) {
			return "application/cu-seeme";
		}

		if ("curl".equals(extension)) {
			return "text/vnd.curl";
		}

		if ("cww".equals(extension)) {
			return "application/prs.cww";
		}

		if ("cxt".equals(extension)) {
			return "application/x-director";
		}

		if ("cxx".equals(extension)) {
			return "text/x-c";
		}

		if ("dae".equals(extension)) {
			return "model/vnd.collada+xml";
		}

		if ("daf".equals(extension)) {
			return "application/vnd.mobius.daf";
		}

		if ("dart".equals(extension)) {
			return "application/vnd.dart";
		}

		if ("dataless".equals(extension)) {
			return "application/vnd.fdsn.seed";
		}

		if ("davmount".equals(extension)) {
			return "application/davmount+xml";
		}

		if ("dbk".equals(extension)) {
			return "application/docbook+xml";
		}

		if ("dcr".equals(extension)) {
			return "application/x-director";
		}

		if ("dcurl".equals(extension)) {
			return "text/vnd.curl.dcurl";
		}

		if ("dd2".equals(extension)) {
			return "application/vnd.oma.dd2+xml";
		}

		if ("ddd".equals(extension)) {
			return "application/vnd.fujixerox.ddd";
		}

		if ("deb".equals(extension)) {
			return "application/x-debian-package";
		}

		if ("def".equals(extension)) {
			return "text/plain";
		}

		if ("deploy".equals(extension)) {
			return "application/octet-stream";
		}

		if ("der".equals(extension)) {
			return "application/x-x509-ca-cert";
		}

		if ("dfac".equals(extension)) {
			return "application/vnd.dreamfactory";
		}

		if ("dgc".equals(extension)) {
			return "application/x-dgc-compressed";
		}

		if ("dib".equals(extension)) {
			return "image/bmp";
		}

		if ("dic".equals(extension)) {
			return "text/x-c";
		}

		if ("dir".equals(extension)) {
			return "application/x-director";
		}

		if ("dis".equals(extension)) {
			return "application/vnd.mobius.dis";
		}

		if ("dist".equals(extension)) {
			return "application/octet-stream";
		}

		if ("distz".equals(extension)) {
			return "application/octet-stream";
		}

		if ("djv".equals(extension)) {
			return "image/vnd.djvu";
		}

		if ("djvu".equals(extension)) {
			return "image/vnd.djvu";
		}

		if ("dll".equals(extension)) {
			return "application/x-msdownload";
		}

		if ("dmg".equals(extension)) {
			return "application/x-apple-diskimage";
		}

		if ("dmp".equals(extension)) {
			return "application/vnd.tcpdump.pcap";
		}

		if ("dms".equals(extension)) {
			return "application/octet-stream";
		}

		if ("dna".equals(extension)) {
			return "application/vnd.dna";
		}

		if ("doc".equals(extension)) {
			return "application/msword";
		}

		if ("docm".equals(extension)) {
			return "application/vnd.ms-word.document.macroenabled.12";
		}

		if ("docx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
		}

		if ("dot".equals(extension)) {
			return "application/msword";
		}

		if ("dotm".equals(extension)) {
			return "application/vnd.ms-word.template.macroenabled.12";
		}

		if ("dotx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.wordprocessingml.template";
		}

		if ("dp".equals(extension)) {
			return "application/vnd.osgi.dp";
		}

		if ("dpg".equals(extension)) {
			return "application/vnd.dpgraph";
		}

		if ("dra".equals(extension)) {
			return "audio/vnd.dra";
		}

		if ("dsc".equals(extension)) {
			return "text/prs.lines.tag";
		}

		if ("dssc".equals(extension)) {
			return "application/dssc+der";
		}

		if ("dtb".equals(extension)) {
			return "application/x-dtbook+xml";
		}

		if ("dtd".equals(extension)) {
			return "application/xml-dtd";
		}

		if ("dts".equals(extension)) {
			return "audio/vnd.dts";
		}

		if ("dtshd".equals(extension)) {
			return "audio/vnd.dts.hd";
		}

		if ("dump".equals(extension)) {
			return "application/octet-stream";
		}

		if ("dv".equals(extension)) {
			return "video/x-dv";
		}

		if ("dvb".equals(extension)) {
			return "video/vnd.dvb.file";
		}

		if ("dvi".equals(extension)) {
			return "application/x-dvi";
		}

		if ("dwf".equals(extension)) {
			return "model/vnd.dwf";
		}

		if ("dwg".equals(extension)) {
			return "image/vnd.dwg";
		}

		if ("dxf".equals(extension)) {
			return "image/vnd.dxf";
		}

		if ("dxp".equals(extension)) {
			return "application/vnd.spotfire.dxp";
		}

		if ("dxr".equals(extension)) {
			return "application/x-director";
		}

		if ("ecelp4800".equals(extension)) {
			return "audio/vnd.nuera.ecelp4800";
		}

		if ("ecelp7470".equals(extension)) {
			return "audio/vnd.nuera.ecelp7470";
		}

		if ("ecelp9600".equals(extension)) {
			return "audio/vnd.nuera.ecelp9600";
		}

		if ("ecma".equals(extension)) {
			return "application/ecmascript";
		}

		if ("edm".equals(extension)) {
			return "application/vnd.novadigm.edm";
		}

		if ("edx".equals(extension)) {
			return "application/vnd.novadigm.edx";
		}

		if ("efif".equals(extension)) {
			return "application/vnd.picsel";
		}

		if ("ei6".equals(extension)) {
			return "application/vnd.pg.osasli";
		}

		if ("elc".equals(extension)) {
			return "application/octet-stream";
		}

		if ("emf".equals(extension)) {
			return "application/x-msmetafile";
		}

		if ("eml".equals(extension)) {
			return "message/rfc822";
		}

		if ("emma".equals(extension)) {
			return "application/emma+xml";
		}

		if ("emz".equals(extension)) {
			return "application/x-msmetafile";
		}

		if ("eol".equals(extension)) {
			return "audio/vnd.digital-winds";
		}

		if ("eot".equals(extension)) {
			return "application/vnd.ms-fontobject";
		}

		if ("eps".equals(extension)) {
			return "application/postscript";
		}

		if ("epub".equals(extension)) {
			return "application/epub+zip";
		}

		if ("es3".equals(extension)) {
			return "application/vnd.eszigno3+xml";
		}

		if ("esa".equals(extension)) {
			return "application/vnd.osgi.subsystem";
		}

		if ("esf".equals(extension)) {
			return "application/vnd.epson.esf";
		}

		if ("et3".equals(extension)) {
			return "application/vnd.eszigno3+xml";
		}

		if ("etx".equals(extension)) {
			return "text/x-setext";
		}

		if ("eva".equals(extension)) {
			return "application/x-eva";
		}

		if ("evy".equals(extension)) {
			return "application/x-envoy";
		}

		if ("exe".equals(extension)) {
			return "application/octet-stream";
		}

		if ("exi".equals(extension)) {
			return "application/exi";
		}

		if ("ext".equals(extension)) {
			return "application/vnd.novadigm.ext";
		}

		if ("ez".equals(extension)) {
			return "application/andrew-inset";
		}

		if ("ez2".equals(extension)) {
			return "application/vnd.ezpix-album";
		}

		if ("ez3".equals(extension)) {
			return "application/vnd.ezpix-package";
		}

		if ("f".equals(extension)) {
			return "text/x-fortran";
		}

		if ("f4v".equals(extension)) {
			return "video/x-f4v";
		}

		if ("f77".equals(extension)) {
			return "text/x-fortran";
		}

		if ("f90".equals(extension)) {
			return "text/x-fortran";
		}

		if ("fbs".equals(extension)) {
			return "image/vnd.fastbidsheet";
		}

		if ("fcdt".equals(extension)) {
			return "application/vnd.adobe.formscentral.fcdt";
		}

		if ("fcs".equals(extension)) {
			return "application/vnd.isac.fcs";
		}

		if ("fdf".equals(extension)) {
			return "application/vnd.fdf";
		}

		if ("fe_launch".equals(extension)) {
			return "application/vnd.denovo.fcselayout-link";
		}

		if ("fg5".equals(extension)) {
			return "application/vnd.fujitsu.oasysgp";
		}

		if ("fgd".equals(extension)) {
			return "application/x-director";
		}

		if ("fh".equals(extension)) {
			return "image/x-freehand";
		}

		if ("fh4".equals(extension)) {
			return "image/x-freehand";
		}

		if ("fh5".equals(extension)) {
			return "image/x-freehand";
		}

		if ("fh7".equals(extension)) {
			return "image/x-freehand";
		}

		if ("fhc".equals(extension)) {
			return "image/x-freehand";
		}

		if ("fig".equals(extension)) {
			return "application/x-xfig";
		}

		if ("flac".equals(extension)) {
			return "audio/flac";
		}

		if ("fli".equals(extension)) {
			return "video/x-fli";
		}

		if ("flo".equals(extension)) {
			return "application/vnd.micrografx.flo";
		}

		if ("flv".equals(extension)) {
			return "video/x-flv";
		}

		if ("flw".equals(extension)) {
			return "application/vnd.kde.kivio";
		}

		if ("flx".equals(extension)) {
			return "text/vnd.fmi.flexstor";
		}

		if ("fly".equals(extension)) {
			return "text/vnd.fly";
		}

		if ("fm".equals(extension)) {
			return "application/vnd.framemaker";
		}

		if ("fnc".equals(extension)) {
			return "application/vnd.frogans.fnc";
		}

		if ("for".equals(extension)) {
			return "text/x-fortran";
		}

		if ("fpx".equals(extension)) {
			return "image/vnd.fpx";
		}

		if ("frame".equals(extension)) {
			return "application/vnd.framemaker";
		}

		if ("fsc".equals(extension)) {
			return "application/vnd.fsc.weblaunch";
		}

		if ("fst".equals(extension)) {
			return "image/vnd.fst";
		}

		if ("ftc".equals(extension)) {
			return "application/vnd.fluxtime.clip";
		}

		if ("fti".equals(extension)) {
			return "application/vnd.anser-web-funds-transfer-initiation";
		}

		if ("fvt".equals(extension)) {
			return "video/vnd.fvt";
		}

		if ("fxp".equals(extension)) {
			return "application/vnd.adobe.fxp";
		}

		if ("fxpl".equals(extension)) {
			return "application/vnd.adobe.fxp";
		}

		if ("fzs".equals(extension)) {
			return "application/vnd.fuzzysheet";
		}

		if ("g2w".equals(extension)) {
			return "application/vnd.geoplan";
		}

		if ("g3".equals(extension)) {
			return "image/g3fax";
		}

		if ("g3w".equals(extension)) {
			return "application/vnd.geospace";
		}

		if ("gac".equals(extension)) {
			return "application/vnd.groove-account";
		}

		if ("gam".equals(extension)) {
			return "application/x-tads";
		}

		if ("gbr".equals(extension)) {
			return "application/rpki-ghostbusters";
		}

		if ("gca".equals(extension)) {
			return "application/x-gca-compressed";
		}

		if ("gdl".equals(extension)) {
			return "model/vnd.gdl";
		}

		if ("geo".equals(extension)) {
			return "application/vnd.dynageo";
		}

		if ("gex".equals(extension)) {
			return "application/vnd.geometry-explorer";
		}

		if ("ggb".equals(extension)) {
			return "application/vnd.geogebra.file";
		}

		if ("ggt".equals(extension)) {
			return "application/vnd.geogebra.tool";
		}

		if ("ghf".equals(extension)) {
			return "application/vnd.groove-help";
		}

		if ("gif".equals(extension)) {
			return "image/gif";
		}

		if ("gim".equals(extension)) {
			return "application/vnd.groove-identity-message";
		}

		if ("gml".equals(extension)) {
			return "application/gml+xml";
		}

		if ("gmx".equals(extension)) {
			return "application/vnd.gmx";
		}

		if ("gnumeric".equals(extension)) {
			return "application/x-gnumeric";
		}

		if ("gph".equals(extension)) {
			return "application/vnd.flographit";
		}

		if ("gpx".equals(extension)) {
			return "application/gpx+xml";
		}

		if ("gqf".equals(extension)) {
			return "application/vnd.grafeq";
		}

		if ("gqs".equals(extension)) {
			return "application/vnd.grafeq";
		}

		if ("gram".equals(extension)) {
			return "application/srgs";
		}

		if ("gramps".equals(extension)) {
			return "application/x-gramps-xml";
		}

		if ("gre".equals(extension)) {
			return "application/vnd.geometry-explorer";
		}

		if ("grv".equals(extension)) {
			return "application/vnd.groove-injector";
		}

		if ("grxml".equals(extension)) {
			return "application/srgs+xml";
		}

		if ("gsf".equals(extension)) {
			return "application/x-font-ghostscript";
		}

		if ("gtar".equals(extension)) {
			return "application/x-gtar";
		}

		if ("gtm".equals(extension)) {
			return "application/vnd.groove-tool-message";
		}

		if ("gtw".equals(extension)) {
			return "model/vnd.gtw";
		}

		if ("gv".equals(extension)) {
			return "text/vnd.graphviz";
		}

		if ("gxf".equals(extension)) {
			return "application/gxf";
		}

		if ("gxt".equals(extension)) {
			return "application/vnd.geonext";
		}

		if ("gz".equals(extension)) {
			return "application/x-gzip";
		}

		if ("h".equals(extension)) {
			return "text/x-c";
		}

		if ("h261".equals(extension)) {
			return "video/h261";
		}

		if ("h263".equals(extension)) {
			return "video/h263";
		}

		if ("h264".equals(extension)) {
			return "video/h264";
		}

		if ("hal".equals(extension)) {
			return "application/vnd.hal+xml";
		}

		if ("hbci".equals(extension)) {
			return "application/vnd.hbci";
		}

		if ("hdf".equals(extension)) {
			return "application/x-hdf";
		}

		if ("hh".equals(extension)) {
			return "text/x-c";
		}

		if ("hlp".equals(extension)) {
			return "application/winhlp";
		}

		if ("hpgl".equals(extension)) {
			return "application/vnd.hp-hpgl";
		}

		if ("hpid".equals(extension)) {
			return "application/vnd.hp-hpid";
		}

		if ("hps".equals(extension)) {
			return "application/vnd.hp-hps";
		}

		if ("hqx".equals(extension)) {
			return "application/mac-binhex40";
		}

		if ("htc".equals(extension)) {
			return "text/x-component";
		}

		if ("htke".equals(extension)) {
			return "application/vnd.kenameaapp";
		}

		if ("htm".equals(extension)) {
			return "text/html";
		}

		if ("html".equals(extension)) {
			return "text/html";
		}

		if ("hvd".equals(extension)) {
			return "application/vnd.yamaha.hv-dic";
		}

		if ("hvp".equals(extension)) {
			return "application/vnd.yamaha.hv-voice";
		}

		if ("hvs".equals(extension)) {
			return "application/vnd.yamaha.hv-script";
		}

		if ("i2g".equals(extension)) {
			return "application/vnd.intergeo";
		}

		if ("icc".equals(extension)) {
			return "application/vnd.iccprofile";
		}

		if ("ice".equals(extension)) {
			return "x-conference/x-cooltalk";
		}

		if ("icm".equals(extension)) {
			return "application/vnd.iccprofile";
		}

		if ("ico".equals(extension)) {
			return "image/x-icon";
		}

		if ("ics".equals(extension)) {
			return "text/calendar";
		}

		if ("ief".equals(extension)) {
			return "image/ief";
		}

		if ("ifb".equals(extension)) {
			return "text/calendar";
		}

		if ("ifm".equals(extension)) {
			return "application/vnd.shana.informed.formdata";
		}

		if ("iges".equals(extension)) {
			return "model/iges";
		}

		if ("igl".equals(extension)) {
			return "application/vnd.igloader";
		}

		if ("igm".equals(extension)) {
			return "application/vnd.insors.igm";
		}

		if ("igs".equals(extension)) {
			return "model/iges";
		}

		if ("igx".equals(extension)) {
			return "application/vnd.micrografx.igx";
		}

		if ("iif".equals(extension)) {
			return "application/vnd.shana.informed.interchange";
		}

		if ("imp".equals(extension)) {
			return "application/vnd.accpac.simply.imp";
		}

		if ("ims".equals(extension)) {
			return "application/vnd.ms-ims";
		}

		if ("in".equals(extension)) {
			return "text/plain";
		}

		if ("ink".equals(extension)) {
			return "application/inkml+xml";
		}

		if ("inkml".equals(extension)) {
			return "application/inkml+xml";
		}

		if ("install".equals(extension)) {
			return "application/x-install-instructions";
		}

		if ("iota".equals(extension)) {
			return "application/vnd.astraea-software.iota";
		}

		if ("ipfix".equals(extension)) {
			return "application/ipfix";
		}

		if ("ipk".equals(extension)) {
			return "application/vnd.shana.informed.package";
		}

		if ("irm".equals(extension)) {
			return "application/vnd.ibm.rights-management";
		}

		if ("irp".equals(extension)) {
			return "application/vnd.irepository.package+xml";
		}

		if ("iso".equals(extension)) {
			return "application/x-iso9660-image";
		}

		if ("itp".equals(extension)) {
			return "application/vnd.shana.informed.formtemplate";
		}

		if ("ivp".equals(extension)) {
			return "application/vnd.immervision-ivp";
		}

		if ("ivu".equals(extension)) {
			return "application/vnd.immervision-ivu";
		}

		if ("jad".equals(extension)) {
			return "text/vnd.sun.j2me.app-descriptor";
		}

		if ("jam".equals(extension)) {
			return "application/vnd.jam";
		}

		if ("jar".equals(extension)) {
			return "application/java-archive";
		}

		if ("java".equals(extension)) {
			return "text/x-java-source";
		}

		if ("jisp".equals(extension)) {
			return "application/vnd.jisp";
		}

		if ("jlt".equals(extension)) {
			return "application/vnd.hp-jlyt";
		}

		if ("jnlp".equals(extension)) {
			return "application/x-java-jnlp-file";
		}

		if ("joda".equals(extension)) {
			return "application/vnd.joost.joda-archive";
		}

		if ("jpe".equals(extension)) {
			return "image/jpeg";
		}

		if ("jpeg".equals(extension)) {
			return "image/jpeg";
		}

		if ("jpg".equals(extension)) {
			return "image/jpeg";
		}

		if ("jpgm".equals(extension)) {
			return "video/jpm";
		}

		if ("jpgv".equals(extension)) {
			return "video/jpeg";
		}

		if ("jpm".equals(extension)) {
			return "video/jpm";
		}

		if ("js".equals(extension)) {
			return "application/javascript";
		}

		if ("jsf".equals(extension)) {
			return "text/plain";
		}

		if ("json".equals(extension)) {
			return "application/json";
		}

		if ("jsonml".equals(extension)) {
			return "application/jsonml+json";
		}

		if ("jspf".equals(extension)) {
			return "text/plain";
		}

		if ("kar".equals(extension)) {
			return "audio/midi";
		}

		if ("karbon".equals(extension)) {
			return "application/vnd.kde.karbon";
		}

		if ("kfo".equals(extension)) {
			return "application/vnd.kde.kformula";
		}

		if ("kia".equals(extension)) {
			return "application/vnd.kidspiration";
		}

		if ("kml".equals(extension)) {
			return "application/vnd.google-earth.kml+xml";
		}

		if ("kmz".equals(extension)) {
			return "application/vnd.google-earth.kmz";
		}

		if ("kne".equals(extension)) {
			return "application/vnd.kinar";
		}

		if ("knp".equals(extension)) {
			return "application/vnd.kinar";
		}

		if ("kon".equals(extension)) {
			return "application/vnd.kde.kontour";
		}

		if ("kpr".equals(extension)) {
			return "application/vnd.kde.kpresenter";
		}

		if ("kpt".equals(extension)) {
			return "application/vnd.kde.kpresenter";
		}

		if ("kpxx".equals(extension)) {
			return "application/vnd.ds-keypoint";
		}

		if ("ksp".equals(extension)) {
			return "application/vnd.kde.kspread";
		}

		if ("ktr".equals(extension)) {
			return "application/vnd.kahootz";
		}

		if ("ktx".equals(extension)) {
			return "image/ktx";
		}

		if ("ktz".equals(extension)) {
			return "application/vnd.kahootz";
		}

		if ("kwd".equals(extension)) {
			return "application/vnd.kde.kword";
		}

		if ("kwt".equals(extension)) {
			return "application/vnd.kde.kword";
		}

		if ("lasxml".equals(extension)) {
			return "application/vnd.las.las+xml";
		}

		if ("latex".equals(extension)) {
			return "application/x-latex";
		}

		if ("lbd".equals(extension)) {
			return "application/vnd.llamagraphics.life-balance.desktop";
		}

		if ("lbe".equals(extension)) {
			return "application/vnd.llamagraphics.life-balance.exchange+xml";
		}

		if ("les".equals(extension)) {
			return "application/vnd.hhe.lesson-player";
		}

		if ("lha".equals(extension)) {
			return "application/x-lzh-compressed";
		}

		if ("link66".equals(extension)) {
			return "application/vnd.route66.link66+xml";
		}

		if ("list".equals(extension)) {
			return "text/plain";
		}

		if ("list3820".equals(extension)) {
			return "application/vnd.ibm.modcap";
		}

		if ("listafp".equals(extension)) {
			return "application/vnd.ibm.modcap";
		}

		if ("lnk".equals(extension)) {
			return "application/x-ms-shortcut";
		}

		if ("log".equals(extension)) {
			return "text/plain";
		}

		if ("lostxml".equals(extension)) {
			return "application/lost+xml";
		}

		if ("lrf".equals(extension)) {
			return "application/octet-stream";
		}

		if ("lrm".equals(extension)) {
			return "application/vnd.ms-lrm";
		}

		if ("ltf".equals(extension)) {
			return "application/vnd.frogans.ltf";
		}

		if ("lvp".equals(extension)) {
			return "audio/vnd.lucent.voice";
		}

		if ("lwp".equals(extension)) {
			return "application/vnd.lotus-wordpro";
		}

		if ("lzh".equals(extension)) {
			return "application/x-lzh-compressed";
		}

		if ("m13".equals(extension)) {
			return "application/x-msmediaview";
		}

		if ("m14".equals(extension)) {
			return "application/x-msmediaview";
		}

		if ("m1v".equals(extension)) {
			return "video/mpeg";
		}

		if ("m21".equals(extension)) {
			return "application/mp21";
		}

		if ("m2a".equals(extension)) {
			return "audio/mpeg";
		}

		if ("m2v".equals(extension)) {
			return "video/mpeg";
		}

		if ("m3a".equals(extension)) {
			return "audio/mpeg";
		}

		if ("m3u".equals(extension)) {
			return "audio/x-mpegurl";
		}

		if ("m3u8".equals(extension)) {
			return "application/vnd.apple.mpegurl";
		}

		if ("m4a".equals(extension)) {
			return "audio/mp4";
		}

		if ("m4b".equals(extension)) {
			return "audio/mp4";
		}

		if ("m4r".equals(extension)) {
			return "audio/mp4";
		}

		if ("m4u".equals(extension)) {
			return "video/vnd.mpegurl";
		}

		if ("m4v".equals(extension)) {
			return "video/mp4";
		}

		if ("ma".equals(extension)) {
			return "application/mathematica";
		}

		if ("mac".equals(extension)) {
			return "image/x-macpaint";
		}

		if ("mads".equals(extension)) {
			return "application/mads+xml";
		}

		if ("mag".equals(extension)) {
			return "application/vnd.ecowin.chart";
		}

		if ("maker".equals(extension)) {
			return "application/vnd.framemaker";
		}

		if ("man".equals(extension)) {
			return "text/troff";
		}

		if ("mar".equals(extension)) {
			return "application/octet-stream";
		}

		if ("mathml".equals(extension)) {
			return "application/mathml+xml";
		}

		if ("mb".equals(extension)) {
			return "application/mathematica";
		}

		if ("mbk".equals(extension)) {
			return "application/vnd.mobius.mbk";
		}

		if ("mbox".equals(extension)) {
			return "application/mbox";
		}

		if ("mc1".equals(extension)) {
			return "application/vnd.medcalcdata";
		}

		if ("mcd".equals(extension)) {
			return "application/vnd.mcd";
		}

		if ("mcurl".equals(extension)) {
			return "text/vnd.curl.mcurl";
		}

		if ("mdb".equals(extension)) {
			return "application/x-msaccess";
		}

		if ("mdi".equals(extension)) {
			return "image/vnd.ms-modi";
		}

		if ("me".equals(extension)) {
			return "text/troff";
		}

		if ("mesh".equals(extension)) {
			return "model/mesh";
		}

		if ("meta4".equals(extension)) {
			return "application/metalink4+xml";
		}

		if ("metalink".equals(extension)) {
			return "application/metalink+xml";
		}

		if ("mets".equals(extension)) {
			return "application/mets+xml";
		}

		if ("mfm".equals(extension)) {
			return "application/vnd.mfmp";
		}

		if ("mft".equals(extension)) {
			return "application/rpki-manifest";
		}

		if ("mgp".equals(extension)) {
			return "application/vnd.osgeo.mapguide.package";
		}

		if ("mgz".equals(extension)) {
			return "application/vnd.proteus.magazine";
		}

		if ("mid".equals(extension)) {
			return "audio/midi";
		}

		if ("midi".equals(extension)) {
			return "audio/midi";
		}

		if ("mie".equals(extension)) {
			return "application/x-mie";
		}

		if ("mif".equals(extension)) {
			return "application/x-mif";
		}

		if ("mime".equals(extension)) {
			return "message/rfc822";
		}

		if ("mj2".equals(extension)) {
			return "video/mj2";
		}

		if ("mjp2".equals(extension)) {
			return "video/mj2";
		}

		if ("mk3d".equals(extension)) {
			return "video/x-matroska";
		}

		if ("mka".equals(extension)) {
			return "audio/x-matroska";
		}

		if ("mks".equals(extension)) {
			return "video/x-matroska";
		}

		if ("mkv".equals(extension)) {
			return "video/x-matroska";
		}

		if ("mlp".equals(extension)) {
			return "application/vnd.dolby.mlp";
		}

		if ("mmd".equals(extension)) {
			return "application/vnd.chipnuts.karaoke-mmd";
		}

		if ("mmf".equals(extension)) {
			return "application/vnd.smaf";
		}

		if ("mmr".equals(extension)) {
			return "image/vnd.fujixerox.edmics-mmr";
		}

		if ("mng".equals(extension)) {
			return "video/x-mng";
		}

		if ("mny".equals(extension)) {
			return "application/x-msmoney";
		}

		if ("mobi".equals(extension)) {
			return "application/x-mobipocket-ebook";
		}

		if ("mods".equals(extension)) {
			return "application/mods+xml";
		}

		if ("mov".equals(extension)) {
			return "video/quicktime";
		}

		if ("movie".equals(extension)) {
			return "video/x-sgi-movie";
		}

		if ("mp1".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mp2".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mp21".equals(extension)) {
			return "application/mp21";
		}

		if ("mp2a".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mp3".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mp4".equals(extension)) {
			return "video/mp4";
		}

		if ("mp4a".equals(extension)) {
			return "audio/mp4";
		}

		if ("mp4s".equals(extension)) {
			return "application/mp4";
		}

		if ("mp4v".equals(extension)) {
			return "video/mp4";
		}

		if ("mpa".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mpc".equals(extension)) {
			return "application/vnd.mophun.certificate";
		}

		if ("mpe".equals(extension)) {
			return "video/mpeg";
		}

		if ("mpeg".equals(extension)) {
			return "video/mpeg";
		}

		if ("mpega".equals(extension)) {
			return "audio/x-mpeg";
		}

		if ("mpg".equals(extension)) {
			return "video/mpeg";
		}

		if ("mpg4".equals(extension)) {
			return "video/mp4";
		}

		if ("mpga".equals(extension)) {
			return "audio/mpeg";
		}

		if ("mpkg".equals(extension)) {
			return "application/vnd.apple.installer+xml";
		}

		if ("mpm".equals(extension)) {
			return "application/vnd.blueice.multipass";
		}

		if ("mpn".equals(extension)) {
			return "application/vnd.mophun.application";
		}

		if ("mpp".equals(extension)) {
			return "application/vnd.ms-project";
		}

		if ("mpt".equals(extension)) {
			return "application/vnd.ms-project";
		}

		if ("mpv2".equals(extension)) {
			return "video/mpeg2";
		}

		if ("mpy".equals(extension)) {
			return "application/vnd.ibm.minipay";
		}

		if ("mqy".equals(extension)) {
			return "application/vnd.mobius.mqy";
		}

		if ("mrc".equals(extension)) {
			return "application/marc";
		}

		if ("mrcx".equals(extension)) {
			return "application/marcxml+xml";
		}

		if ("ms".equals(extension)) {
			return "text/troff";
		}

		if ("mscml".equals(extension)) {
			return "application/mediaservercontrol+xml";
		}

		if ("mseed".equals(extension)) {
			return "application/vnd.fdsn.mseed";
		}

		if ("mseq".equals(extension)) {
			return "application/vnd.mseq";
		}

		if ("msf".equals(extension)) {
			return "application/vnd.epson.msf";
		}

		if ("msh".equals(extension)) {
			return "model/mesh";
		}

		if ("msi".equals(extension)) {
			return "application/x-msdownload";
		}

		if ("msl".equals(extension)) {
			return "application/vnd.mobius.msl";
		}

		if ("msty".equals(extension)) {
			return "application/vnd.muvee.style";
		}

		if ("mts".equals(extension)) {
			return "model/vnd.mts";
		}

		if ("mus".equals(extension)) {
			return "application/vnd.musician";
		}

		if ("musicxml".equals(extension)) {
			return "application/vnd.recordare.musicxml+xml";
		}

		if ("mvb".equals(extension)) {
			return "application/x-msmediaview";
		}

		if ("mwf".equals(extension)) {
			return "application/vnd.mfer";
		}

		if ("mxf".equals(extension)) {
			return "application/mxf";
		}

		if ("mxl".equals(extension)) {
			return "application/vnd.recordare.musicxml";
		}

		if ("mxml".equals(extension)) {
			return "application/xv+xml";
		}

		if ("mxs".equals(extension)) {
			return "application/vnd.triscape.mxs";
		}

		if ("mxu".equals(extension)) {
			return "video/vnd.mpegurl";
		}

		if ("n-gage".equals(extension)) {
			return "application/vnd.nokia.n-gage.symbian.install";
		}

		if ("n3".equals(extension)) {
			return "text/n3";
		}

		if ("nb".equals(extension)) {
			return "application/mathematica";
		}

		if ("nbp".equals(extension)) {
			return "application/vnd.wolfram.player";
		}

		if ("nc".equals(extension)) {
			return "application/x-netcdf";
		}

		if ("ncx".equals(extension)) {
			return "application/x-dtbncx+xml";
		}

		if ("nfo".equals(extension)) {
			return "text/x-nfo";
		}

		if ("ngdat".equals(extension)) {
			return "application/vnd.nokia.n-gage.data";
		}

		if ("nitf".equals(extension)) {
			return "application/vnd.nitf";
		}

		if ("nlu".equals(extension)) {
			return "application/vnd.neurolanguage.nlu";
		}

		if ("nml".equals(extension)) {
			return "application/vnd.enliven";
		}

		if ("nnd".equals(extension)) {
			return "application/vnd.noblenet-directory";
		}

		if ("nns".equals(extension)) {
			return "application/vnd.noblenet-sealer";
		}

		if ("nnw".equals(extension)) {
			return "application/vnd.noblenet-web";
		}

		if ("npx".equals(extension)) {
			return "image/vnd.net-fpx";
		}

		if ("nsc".equals(extension)) {
			return "application/x-conference";
		}

		if ("nsf".equals(extension)) {
			return "application/vnd.lotus-notes";
		}

		if ("ntf".equals(extension)) {
			return "application/vnd.nitf";
		}

		if ("nzb".equals(extension)) {
			return "application/x-nzb";
		}

		if ("oa2".equals(extension)) {
			return "application/vnd.fujitsu.oasys2";
		}

		if ("oa3".equals(extension)) {
			return "application/vnd.fujitsu.oasys3";
		}

		if ("oas".equals(extension)) {
			return "application/vnd.fujitsu.oasys";
		}

		if ("obd".equals(extension)) {
			return "application/x-msbinder";
		}

		if ("obj".equals(extension)) {
			return "application/x-tgif";
		}

		if ("oda".equals(extension)) {
			return "application/oda";
		}

		// OpenDocument Database
		if ("odb".equals(extension)) {
			return "application/vnd.oasis.opendocument.database";
		}

		// OpenDocument Chart
		if ("odc".equals(extension)) {
			return "application/vnd.oasis.opendocument.chart";
		}

		// OpenDocument Formula
		if ("odf".equals(extension)) {
			return "application/vnd.oasis.opendocument.formula";
		}

		if ("odft".equals(extension)) {
			return "application/vnd.oasis.opendocument.formula-template";
		}

		// OpenDocument Drawing
		if ("odg".equals(extension)) {
			return "application/vnd.oasis.opendocument.graphics";
		}

		// OpenDocument Image
		if ("odi".equals(extension)) {
			return "application/vnd.oasis.opendocument.image";
		}

		// OpenDocument Master Document
		if ("odm".equals(extension)) {
			return "application/vnd.oasis.opendocument.text-master";
		}

		// OpenDocument Presentation
		if ("odp".equals(extension)) {
			return "application/vnd.oasis.opendocument.presentation";
		}

		// OpenDocument Spreadsheet
		if ("ods".equals(extension)) {
			return "application/vnd.oasis.opendocument.spreadsheet";
		}

		// OpenDocument Text
		if ("odt".equals(extension)) {
			return "application/vnd.oasis.opendocument.text";
		}

		if ("oga".equals(extension)) {
			return "audio/ogg";
		}

		if ("ogg".equals(extension)) {
			return "audio/ogg";
		}

		if ("ogv".equals(extension)) {
			return "video/ogg";
		}

		// xiph mime types
		if ("ogx".equals(extension)) {
			return "application/ogg";
		}

		if ("omdoc".equals(extension)) {
			return "application/omdoc+xml";
		}

		if ("onepkg".equals(extension)) {
			return "application/onenote";
		}

		if ("onetmp".equals(extension)) {
			return "application/onenote";
		}

		if ("onetoc".equals(extension)) {
			return "application/onenote";
		}

		if ("onetoc2".equals(extension)) {
			return "application/onenote";
		}

		if ("opf".equals(extension)) {
			return "application/oebps-package+xml";
		}

		if ("opml".equals(extension)) {
			return "text/x-opml";
		}

		if ("oprc".equals(extension)) {
			return "application/vnd.palm";
		}

		if ("org".equals(extension)) {
			return "application/vnd.lotus-organizer";
		}

		if ("osf".equals(extension)) {
			return "application/vnd.yamaha.openscoreformat";
		}

		if ("osfpvg".equals(extension)) {
			return "application/vnd.yamaha.openscoreformat.osfpvg+xml";
		}

		if ("otc".equals(extension)) {
			return "application/vnd.oasis.opendocument.chart-template";
		}

		if ("otf".equals(extension)) {
			return "application/x-font-otf";
		}

		// OpenDocument Drawing Template
		if ("otg".equals(extension)) {
			return "application/vnd.oasis.opendocument.graphics-template";
		}

		// HTML Document Template
		if ("oth".equals(extension)) {
			return "application/vnd.oasis.opendocument.text-web";
		}

		if ("oti".equals(extension)) {
			return "application/vnd.oasis.opendocument.image-template";
		}

		// OpenDocument Presentation Template
		if ("otp".equals(extension)) {
			return "application/vnd.oasis.opendocument.presentation-template";
		}

		// OpenDocument Spreadsheet Template
		if ("ots".equals(extension)) {
			return "application/vnd.oasis.opendocument.spreadsheet-template";
		}

		// OpenDocument Text Template
		if ("ott".equals(extension)) {
			return "application/vnd.oasis.opendocument.text-template";
		}

		if ("oxps".equals(extension)) {
			return "application/oxps";
		}

		if ("oxt".equals(extension)) {
			return "application/vnd.openofficeorg.extension";
		}

		if ("p".equals(extension)) {
			return "text/x-pascal";
		}

		if ("p10".equals(extension)) {
			return "application/pkcs10";
		}

		if ("p12".equals(extension)) {
			return "application/x-pkcs12";
		}

		if ("p7b".equals(extension)) {
			return "application/x-pkcs7-certificates";
		}

		if ("p7c".equals(extension)) {
			return "application/pkcs7-mime";
		}

		if ("p7m".equals(extension)) {
			return "application/pkcs7-mime";
		}

		if ("p7r".equals(extension)) {
			return "application/x-pkcs7-certreqresp";
		}

		if ("p7s".equals(extension)) {
			return "application/pkcs7-signature";
		}

		if ("p8".equals(extension)) {
			return "application/pkcs8";
		}

		if ("pas".equals(extension)) {
			return "text/x-pascal";
		}

		if ("paw".equals(extension)) {
			return "application/vnd.pawaafile";
		}

		if ("pbd".equals(extension)) {
			return "application/vnd.powerbuilder6";
		}

		if ("pbm".equals(extension)) {
			return "image/x-portable-bitmap";
		}

		if ("pcap".equals(extension)) {
			return "application/vnd.tcpdump.pcap";
		}

		if ("pcf".equals(extension)) {
			return "application/x-font-pcf";
		}

		if ("pcl".equals(extension)) {
			return "application/vnd.hp-pcl";
		}

		if ("pclxl".equals(extension)) {
			return "application/vnd.hp-pclxl";
		}

		if ("pct".equals(extension)) {
			return "image/pict";
		}

		if ("pcurl".equals(extension)) {
			return "application/vnd.curl.pcurl";
		}

		if ("pcx".equals(extension)) {
			return "image/x-pcx";
		}

		if ("pdb".equals(extension)) {
			return "application/vnd.palm";
		}

		if ("pdf".equals(extension)) {
			return "application/pdf";
		}

		if ("pfa".equals(extension)) {
			return "application/x-font-type1";
		}

		if ("pfb".equals(extension)) {
			return "application/x-font-type1";
		}

		if ("pfm".equals(extension)) {
			return "application/x-font-type1";
		}

		if ("pfr".equals(extension)) {
			return "application/font-tdpfr";
		}

		if ("pfx".equals(extension)) {
			return "application/x-pkcs12";
		}

		if ("pgm".equals(extension)) {
			return "image/x-portable-graymap";
		}

		if ("pgn".equals(extension)) {
			return "application/x-chess-pgn";
		}

		if ("pgp".equals(extension)) {
			return "application/pgp-encrypted";
		}

		if ("pic".equals(extension)) {
			return "image/pict";
		}

		if ("pict".equals(extension)) {
			return "image/pict";
		}

		if ("pkg".equals(extension)) {
			return "application/octet-stream";
		}

		if ("pki".equals(extension)) {
			return "application/pkixcmp";
		}

		if ("pkipath".equals(extension)) {
			return "application/pkix-pkipath";
		}

		if ("plb".equals(extension)) {
			return "application/vnd.3gpp.pic-bw-large";
		}

		if ("plc".equals(extension)) {
			return "application/vnd.mobius.plc";
		}

		if ("plf".equals(extension)) {
			return "application/vnd.pocketlearn";
		}

		if ("pls".equals(extension)) {
			return "audio/x-scpls";
		}

		if ("pml".equals(extension)) {
			return "application/vnd.ctc-posml";
		}

		if ("png".equals(extension)) {
			return "image/png";
		}

		if ("pnm".equals(extension)) {
			return "image/x-portable-anymap";
		}

		if ("pnt".equals(extension)) {
			return "image/x-macpaint";
		}

		if ("portpkg".equals(extension)) {
			return "application/vnd.macports.portpkg";
		}

		if ("pot".equals(extension)) {
			return "application/vnd.ms-powerpoint";
		}

		if ("potm".equals(extension)) {
			return "application/vnd.ms-powerpoint.template.macroenabled.12";
		}

		if ("potx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.presentationml.template";
		}

		if ("ppam".equals(extension)) {
			return "application/vnd.ms-powerpoint.addin.macroenabled.12";
		}

		if ("ppd".equals(extension)) {
			return "application/vnd.cups-ppd";
		}

		if ("ppm".equals(extension)) {
			return "image/x-portable-pixmap";
		}

		if ("pps".equals(extension)) {
			return "application/vnd.ms-powerpoint";
		}

		if ("ppsm".equals(extension)) {
			return "application/vnd.ms-powerpoint.slideshow.macroenabled.12";
		}

		if ("ppsx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.presentationml.slideshow";
		}

		if ("ppt".equals(extension)) {
			return "application/vnd.ms-powerpoint";
		}

		if ("pptm".equals(extension)) {
			return "application/vnd.ms-powerpoint.presentation.macroenabled.12";
		}

		if ("pptx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
		}

		if ("pqa".equals(extension)) {
			return "application/vnd.palm";
		}

		if ("prc".equals(extension)) {
			return "application/x-mobipocket-ebook";
		}

		if ("pre".equals(extension)) {
			return "application/vnd.lotus-freelance";
		}

		if ("prf".equals(extension)) {
			return "application/pics-rules";
		}

		if ("ps".equals(extension)) {
			return "application/postscript";
		}

		if ("psb".equals(extension)) {
			return "application/vnd.3gpp.pic-bw-small";
		}

		if ("psd".equals(extension)) {
			return "image/vnd.adobe.photoshop";
		}

		if ("psf".equals(extension)) {
			return "application/x-font-linux-psf";
		}

		if ("pskcxml".equals(extension)) {
			return "application/pskc+xml";
		}

		if ("ptid".equals(extension)) {
			return "application/vnd.pvi.ptid1";
		}

		if ("pub".equals(extension)) {
			return "application/x-mspublisher";
		}

		if ("pvb".equals(extension)) {
			return "application/vnd.3gpp.pic-bw-var";
		}

		if ("pwn".equals(extension)) {
			return "application/vnd.3m.post-it-notes";
		}

		if ("pya".equals(extension)) {
			return "audio/vnd.ms-playready.media.pya";
		}

		if ("pyv".equals(extension)) {
			return "video/vnd.ms-playready.media.pyv";
		}

		if ("qam".equals(extension)) {
			return "application/vnd.epson.quickanime";
		}

		if ("qbo".equals(extension)) {
			return "application/vnd.intu.qbo";
		}

		if ("qfx".equals(extension)) {
			return "application/vnd.intu.qfx";
		}

		if ("qps".equals(extension)) {
			return "application/vnd.publishare-delta-tree";
		}

		if ("qt".equals(extension)) {
			return "video/quicktime";
		}

		if ("qti".equals(extension)) {
			return "image/x-quicktime";
		}

		if ("qtif".equals(extension)) {
			return "image/x-quicktime";
		}

		if ("qwd".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("qwt".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("qxb".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("qxd".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("qxl".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("qxt".equals(extension)) {
			return "application/vnd.quark.quarkxpress";
		}

		if ("ra".equals(extension)) {
			return "audio/x-pn-realaudio";
		}

		if ("ram".equals(extension)) {
			return "audio/x-pn-realaudio";
		}

		if ("rar".equals(extension)) {
			return "application/x-rar-compressed";
		}

		if ("ras".equals(extension)) {
			return "image/x-cmu-raster";
		}

		if ("rcprofile".equals(extension)) {
			return "application/vnd.ipunplugged.rcprofile";
		}

		if ("rdf".equals(extension)) {
			return "application/rdf+xml";
		}

		if ("rdz".equals(extension)) {
			return "application/vnd.data-vision.rdz";
		}

		if ("rep".equals(extension)) {
			return "application/vnd.businessobjects";
		}

		if ("res".equals(extension)) {
			return "application/x-dtbresource+xml";
		}

		if ("rgb".equals(extension)) {
			return "image/x-rgb";
		}

		if ("rif".equals(extension)) {
			return "application/reginfo+xml";
		}

		if ("rip".equals(extension)) {
			return "audio/vnd.rip";
		}

		if ("ris".equals(extension)) {
			return "application/x-research-info-systems";
		}

		if ("rl".equals(extension)) {
			return "application/resource-lists+xml";
		}

		if ("rlc".equals(extension)) {
			return "image/vnd.fujixerox.edmics-rlc";
		}

		if ("rld".equals(extension)) {
			return "application/resource-lists-diff+xml";
		}

		if ("rm".equals(extension)) {
			return "application/vnd.rn-realmedia";
		}

		if ("rmi".equals(extension)) {
			return "audio/midi";
		}

		if ("rmp".equals(extension)) {
			return "audio/x-pn-realaudio-plugin";
		}

		if ("rms".equals(extension)) {
			return "application/vnd.jcp.javame.midlet-rms";
		}

		if ("rmvb".equals(extension)) {
			return "application/vnd.rn-realmedia-vbr";
		}

		if ("rnc".equals(extension)) {
			return "application/relax-ng-compact-syntax";
		}

		if ("roa".equals(extension)) {
			return "application/rpki-roa";
		}

		if ("roff".equals(extension)) {
			return "text/troff";
		}

		if ("rp9".equals(extension)) {
			return "application/vnd.cloanto.rp9";
		}

		if ("rpss".equals(extension)) {
			return "application/vnd.nokia.radio-presets";
		}

		if ("rpst".equals(extension)) {
			return "application/vnd.nokia.radio-preset";
		}

		if ("rq".equals(extension)) {
			return "application/sparql-query";
		}

		if ("rs".equals(extension)) {
			return "application/rls-services+xml";
		}

		if ("rsd".equals(extension)) {
			return "application/rsd+xml";
		}

		if ("rss".equals(extension)) {
			return "application/rss+xml";
		}

		if ("rtf".equals(extension)) {
			return "application/rtf";
		}

		if ("rtx".equals(extension)) {
			return "text/richtext";
		}

		if ("s".equals(extension)) {
			return "text/x-asm";
		}

		if ("s3m".equals(extension)) {
			return "audio/s3m";
		}

		if ("saf".equals(extension)) {
			return "application/vnd.yamaha.smaf-audio";
		}

		if ("sbml".equals(extension)) {
			return "application/sbml+xml";
		}

		if ("sc".equals(extension)) {
			return "application/vnd.ibm.secure-container";
		}

		if ("scd".equals(extension)) {
			return "application/x-msschedule";
		}

		if ("scm".equals(extension)) {
			return "application/vnd.lotus-screencam";
		}

		if ("scq".equals(extension)) {
			return "application/scvp-cv-request";
		}

		if ("scs".equals(extension)) {
			return "application/scvp-cv-response";
		}

		if ("scurl".equals(extension)) {
			return "text/vnd.curl.scurl";
		}

		if ("sda".equals(extension)) {
			return "application/vnd.stardivision.draw";
		}

		if ("sdc".equals(extension)) {
			return "application/vnd.stardivision.calc";
		}

		if ("sdd".equals(extension)) {
			return "application/vnd.stardivision.impress";
		}

		if ("sdkd".equals(extension)) {
			return "application/vnd.solent.sdkm+xml";
		}

		if ("sdkm".equals(extension)) {
			return "application/vnd.solent.sdkm+xml";
		}

		if ("sdp".equals(extension)) {
			return "application/sdp";
		}

		if ("sdw".equals(extension)) {
			return "application/vnd.stardivision.writer";
		}

		if ("see".equals(extension)) {
			return "application/vnd.seemail";
		}

		if ("seed".equals(extension)) {
			return "application/vnd.fdsn.seed";
		}

		if ("sema".equals(extension)) {
			return "application/vnd.sema";
		}

		if ("semd".equals(extension)) {
			return "application/vnd.semd";
		}

		if ("semf".equals(extension)) {
			return "application/vnd.semf";
		}

		if ("ser".equals(extension)) {
			return "application/java-serialized-object";
		}

		if ("setpay".equals(extension)) {
			return "application/set-payment-initiation";
		}

		if ("setreg".equals(extension)) {
			return "application/set-registration-initiation";
		}

		if ("sfd-hdstx".equals(extension)) {
			return "application/vnd.hydrostatix.sof-data";
		}

		if ("sfs".equals(extension)) {
			return "application/vnd.spotfire.sfs";
		}

		if ("sfv".equals(extension)) {
			return "text/x-sfv";
		}

		if ("sgi".equals(extension)) {
			return "image/sgi";
		}

		if ("sgl".equals(extension)) {
			return "application/vnd.stardivision.writer-global";
		}

		if ("sgm".equals(extension)) {
			return "text/sgml";
		}

		if ("sgml".equals(extension)) {
			return "text/sgml";
		}

		if ("sh".equals(extension)) {
			return "application/x-sh";
		}

		if ("shar".equals(extension)) {
			return "application/x-shar";
		}

		if ("shf".equals(extension)) {
			return "application/shf+xml";
		}

		if ("shtml".equals(extension)) {
			return "text/x-server-parsed-html";
		}

		if ("sid".equals(extension)) {
			return "image/x-mrsid-image";
		}

		if ("sig".equals(extension)) {
			return "application/pgp-signature";
		}

		if ("sil".equals(extension)) {
			return "audio/silk";
		}

		if ("silo".equals(extension)) {
			return "model/mesh";
		}

		if ("sis".equals(extension)) {
			return "application/vnd.symbian.install";
		}

		if ("sisx".equals(extension)) {
			return "application/vnd.symbian.install";
		}

		if ("sit".equals(extension)) {
			return "application/x-stuffit";
		}

		if ("sitx".equals(extension)) {
			return "application/x-stuffitx";
		}

		if ("skd".equals(extension)) {
			return "application/vnd.koan";
		}

		if ("skm".equals(extension)) {
			return "application/vnd.koan";
		}

		if ("skp".equals(extension)) {
			return "application/vnd.koan";
		}

		if ("skt".equals(extension)) {
			return "application/vnd.koan";
		}

		if ("sldm".equals(extension)) {
			return "application/vnd.ms-powerpoint.slide.macroenabled.12";
		}

		if ("sldx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.presentationml.slide";
		}

		if ("slt".equals(extension)) {
			return "application/vnd.epson.salt";
		}

		if ("sm".equals(extension)) {
			return "application/vnd.stepmania.stepchart";
		}

		if ("smf".equals(extension)) {
			return "application/vnd.stardivision.math";
		}

		if ("smi".equals(extension)) {
			return "application/smil+xml";
		}

		if ("smil".equals(extension)) {
			return "application/smil+xml";
		}

		if ("smv".equals(extension)) {
			return "video/x-smv";
		}

		if ("smzip".equals(extension)) {
			return "application/vnd.stepmania.package";
		}

		if ("snd".equals(extension)) {
			return "audio/basic";
		}

		if ("snf".equals(extension)) {
			return "application/x-font-snf";
		}

		if ("so".equals(extension)) {
			return "application/octet-stream";
		}

		if ("spc".equals(extension)) {
			return "application/x-pkcs7-certificates";
		}

		if ("spf".equals(extension)) {
			return "application/vnd.yamaha.smaf-phrase";
		}

		if ("spl".equals(extension)) {
			return "application/x-futuresplash";
		}

		if ("spot".equals(extension)) {
			return "text/vnd.in3d.spot";
		}

		if ("spp".equals(extension)) {
			return "application/scvp-vp-response";
		}

		if ("spq".equals(extension)) {
			return "application/scvp-vp-request";
		}

		if ("spx".equals(extension)) {
			return "audio/ogg";
		}

		if ("sql".equals(extension)) {
			return "application/x-sql";
		}

		if ("src".equals(extension)) {
			return "application/x-wais-source";
		}

		if ("srt".equals(extension)) {
			return "application/x-subrip";
		}

		if ("sru".equals(extension)) {
			return "application/sru+xml";
		}

		if ("srx".equals(extension)) {
			return "application/sparql-results+xml";
		}

		if ("ssdl".equals(extension)) {
			return "application/ssdl+xml";
		}

		if ("sse".equals(extension)) {
			return "application/vnd.kodak-descriptor";
		}

		if ("ssf".equals(extension)) {
			return "application/vnd.epson.ssf";
		}

		if ("ssml".equals(extension)) {
			return "application/ssml+xml";
		}

		if ("st".equals(extension)) {
			return "application/vnd.sailingtracker.track";
		}

		if ("stc".equals(extension)) {
			return "application/vnd.sun.xml.calc.template";
		}

		if ("std".equals(extension)) {
			return "application/vnd.sun.xml.draw.template";
		}

		if ("stf".equals(extension)) {
			return "application/vnd.wt.stf";
		}

		if ("sti".equals(extension)) {
			return "application/vnd.sun.xml.impress.template";
		}

		if ("stk".equals(extension)) {
			return "application/hyperstudio";
		}

		if ("stl".equals(extension)) {
			return "application/vnd.ms-pki.stl";
		}

		if ("str".equals(extension)) {
			return "application/vnd.pg.format";
		}

		if ("stw".equals(extension)) {
			return "application/vnd.sun.xml.writer.template";
		}

		if ("sub".equals(extension)) {
			return "text/vnd.dvb.subtitle";
		}

		if ("sus".equals(extension)) {
			return "application/vnd.sus-calendar";
		}

		if ("susp".equals(extension)) {
			return "application/vnd.sus-calendar";
		}

		if ("sv4cpio".equals(extension)) {
			return "application/x-sv4cpio";
		}

		if ("sv4crc".equals(extension)) {
			return "application/x-sv4crc";
		}

		if ("svc".equals(extension)) {
			return "application/vnd.dvb.service";
		}

		if ("svd".equals(extension)) {
			return "application/vnd.svd";
		}

		if ("svg".equals(extension)) {
			return "image/svg+xml";
		}

		if ("svgz".equals(extension)) {
			return "image/svg+xml";
		}

		if ("swa".equals(extension)) {
			return "application/x-director";
		}

		if ("swf".equals(extension)) {
			return "application/x-shockwave-flash";
		}

		if ("swi".equals(extension)) {
			return "application/vnd.aristanetworks.swi";
		}

		if ("sxc".equals(extension)) {
			return "application/vnd.sun.xml.calc";
		}

		if ("sxd".equals(extension)) {
			return "application/vnd.sun.xml.draw";
		}

		if ("sxg".equals(extension)) {
			return "application/vnd.sun.xml.writer.global";
		}

		if ("sxi".equals(extension)) {
			return "application/vnd.sun.xml.impress";
		}

		if ("sxm".equals(extension)) {
			return "application/vnd.sun.xml.math";
		}

		if ("sxw".equals(extension)) {
			return "application/vnd.sun.xml.writer";
		}

		if ("t".equals(extension)) {
			return "text/troff";
		}

		if ("t3".equals(extension)) {
			return "application/x-t3vm-image";
		}

		if ("taglet".equals(extension)) {
			return "application/vnd.mynfc";
		}

		if ("tao".equals(extension)) {
			return "application/vnd.tao.intent-module-archive";
		}

		if ("tar".equals(extension)) {
			return "application/x-tar";
		}

		if ("tcap".equals(extension)) {
			return "application/vnd.3gpp2.tcap";
		}

		if ("tcl".equals(extension)) {
			return "application/x-tcl";
		}

		if ("teacher".equals(extension)) {
			return "application/vnd.smart.teacher";
		}

		if ("tei".equals(extension)) {
			return "application/tei+xml";
		}

		if ("teicorpus".equals(extension)) {
			return "application/tei+xml";
		}

		if ("tex".equals(extension)) {
			return "application/x-tex";
		}

		if ("texi".equals(extension)) {
			return "application/x-texinfo";
		}

		if ("texinfo".equals(extension)) {
			return "application/x-texinfo";
		}

		if ("text".equals(extension)) {
			return "text/plain";
		}

		if ("tfi".equals(extension)) {
			return "application/thraud+xml";
		}

		if ("tfm".equals(extension)) {
			return "application/x-tex-tfm";
		}

		if ("tga".equals(extension)) {
			return "image/x-tga";
		}

		if ("thmx".equals(extension)) {
			return "application/vnd.ms-officetheme";
		}

		if ("tif".equals(extension)) {
			return "image/tiff";
		}

		if ("tiff".equals(extension)) {
			return "image/tiff";
		}

		if ("tmo".equals(extension)) {
			return "application/vnd.tmobile-livetv";
		}

		if ("torrent".equals(extension)) {
			return "application/x-bittorrent";
		}

		if ("tpl".equals(extension)) {
			return "application/vnd.groove-tool-template";
		}

		if ("tpt".equals(extension)) {
			return "application/vnd.trid.tpt";
		}

		if ("tr".equals(extension)) {
			return "text/troff";
		}

		if ("tra".equals(extension)) {
			return "application/vnd.trueapp";
		}

		if ("trm".equals(extension)) {
			return "application/x-msterminal";
		}

		if ("tsd".equals(extension)) {
			return "application/timestamped-data";
		}

		if ("tsv".equals(extension)) {
			return "text/tab-separated-values";
		}

		if ("ttc".equals(extension)) {
			return "application/x-font-ttf";
		}

		if ("ttf".equals(extension)) {
			return "application/x-font-ttf";
		}

		if ("ttl".equals(extension)) {
			return "text/turtle";
		}

		if ("twd".equals(extension)) {
			return "application/vnd.simtech-mindmapper";
		}

		if ("twds".equals(extension)) {
			return "application/vnd.simtech-mindmapper";
		}

		if ("txd".equals(extension)) {
			return "application/vnd.genomatix.tuxedo";
		}

		if ("txf".equals(extension)) {
			return "application/vnd.mobius.txf";
		}

		if ("txt".equals(extension)) {
			return "text/plain";
		}

		if ("u32".equals(extension)) {
			return "application/x-authorware-bin";
		}

		if ("udeb".equals(extension)) {
			return "application/x-debian-package";
		}

		if ("ufd".equals(extension)) {
			return "application/vnd.ufdl";
		}

		if ("ufdl".equals(extension)) {
			return "application/vnd.ufdl";
		}

		if ("ulw".equals(extension)) {
			return "audio/basic";
		}

		if ("ulx".equals(extension)) {
			return "application/x-glulx";
		}

		if ("umj".equals(extension)) {
			return "application/vnd.umajin";
		}

		if ("unityweb".equals(extension)) {
			return "application/vnd.unity";
		}

		if ("uoml".equals(extension)) {
			return "application/vnd.uoml+xml";
		}

		if ("uri".equals(extension)) {
			return "text/uri-list";
		}

		if ("uris".equals(extension)) {
			return "text/uri-list";
		}

		if ("urls".equals(extension)) {
			return "text/uri-list";
		}

		if ("ustar".equals(extension)) {
			return "application/x-ustar";
		}

		if ("utz".equals(extension)) {
			return "application/vnd.uiq.theme";
		}

		if ("uu".equals(extension)) {
			return "text/x-uuencode";
		}

		if ("uva".equals(extension)) {
			return "audio/vnd.dece.audio";
		}

		if ("uvd".equals(extension)) {
			return "application/vnd.dece.data";
		}

		if ("uvf".equals(extension)) {
			return "application/vnd.dece.data";
		}

		if ("uvg".equals(extension)) {
			return "image/vnd.dece.graphic";
		}

		if ("uvh".equals(extension)) {
			return "video/vnd.dece.hd";
		}

		if ("uvi".equals(extension)) {
			return "image/vnd.dece.graphic";
		}

		if ("uvm".equals(extension)) {
			return "video/vnd.dece.mobile";
		}

		if ("uvp".equals(extension)) {
			return "video/vnd.dece.pd";
		}

		if ("uvs".equals(extension)) {
			return "video/vnd.dece.sd";
		}

		if ("uvt".equals(extension)) {
			return "application/vnd.dece.ttml+xml";
		}

		if ("uvu".equals(extension)) {
			return "video/vnd.uvvu.mp4";
		}

		if ("uvv".equals(extension)) {
			return "video/vnd.dece.video";
		}

		if ("uvva".equals(extension)) {
			return "audio/vnd.dece.audio";
		}

		if ("uvvd".equals(extension)) {
			return "application/vnd.dece.data";
		}

		if ("uvvf".equals(extension)) {
			return "application/vnd.dece.data";
		}

		if ("uvvg".equals(extension)) {
			return "image/vnd.dece.graphic";
		}

		if ("uvvh".equals(extension)) {
			return "video/vnd.dece.hd";
		}

		if ("uvvi".equals(extension)) {
			return "image/vnd.dece.graphic";
		}

		if ("uvvm".equals(extension)) {
			return "video/vnd.dece.mobile";
		}

		if ("uvvp".equals(extension)) {
			return "video/vnd.dece.pd";
		}

		if ("uvvs".equals(extension)) {
			return "video/vnd.dece.sd";
		}

		if ("uvvt".equals(extension)) {
			return "application/vnd.dece.ttml+xml";
		}

		if ("uvvu".equals(extension)) {
			return "video/vnd.uvvu.mp4";
		}

		if ("uvvv".equals(extension)) {
			return "video/vnd.dece.video";
		}

		if ("uvvx".equals(extension)) {
			return "application/vnd.dece.unspecified";
		}

		if ("uvvz".equals(extension)) {
			return "application/vnd.dece.zip";
		}

		if ("uvx".equals(extension)) {
			return "application/vnd.dece.unspecified";
		}

		if ("uvz".equals(extension)) {
			return "application/vnd.dece.zip";
		}

		if ("vcard".equals(extension)) {
			return "text/vcard";
		}

		if ("vcd".equals(extension)) {
			return "application/x-cdlink";
		}

		if ("vcf".equals(extension)) {
			return "text/x-vcard";
		}

		if ("vcg".equals(extension)) {
			return "application/vnd.groove-vcard";
		}

		if ("vcs".equals(extension)) {
			return "text/x-vcalendar";
		}

		if ("vcx".equals(extension)) {
			return "application/vnd.vcx";
		}

		if ("vis".equals(extension)) {
			return "application/vnd.visionary";
		}

		if ("viv".equals(extension)) {
			return "video/vnd.vivo";
		}

		if ("vob".equals(extension)) {
			return "video/x-ms-vob";
		}

		if ("vor".equals(extension)) {
			return "application/vnd.stardivision.writer";
		}

		if ("vox".equals(extension)) {
			return "application/x-authorware-bin";
		}

		if ("vrml".equals(extension)) {
			return "model/vrml";
		}

		if ("vsd".equals(extension)) {
			return "application/vnd.visio";
		}

		if ("vsf".equals(extension)) {
			return "application/vnd.vsf";
		}

		if ("vss".equals(extension)) {
			return "application/vnd.visio";
		}

		if ("vst".equals(extension)) {
			return "application/vnd.visio";
		}

		if ("vsw".equals(extension)) {
			return "application/vnd.visio";
		}

		if ("vtu".equals(extension)) {
			return "model/vnd.vtu";
		}

		if ("vxml".equals(extension)) {
			return "application/voicexml+xml";
		}

		if ("w3d".equals(extension)) {
			return "application/x-director";
		}

		if ("wad".equals(extension)) {
			return "application/x-doom";
		}

		if ("wav".equals(extension)) {
			return "audio/x-wav";
		}

		if ("wax".equals(extension)) {
			return "audio/x-ms-wax";
		}

		// Wireless Bitmap
		if ("wbmp".equals(extension)) {
			return "image/vnd.wap.wbmp";
		}

		if ("wbs".equals(extension)) {
			return "application/vnd.criticaltools.wbs+xml";
		}

		if ("wbxml".equals(extension)) {
			return "application/vnd.wap.wbxml";
		}

		if ("wcm".equals(extension)) {
			return "application/vnd.ms-works";
		}

		if ("wdb".equals(extension)) {
			return "application/vnd.ms-works";
		}

		if ("wdp".equals(extension)) {
			return "image/vnd.ms-photo";
		}

		if ("weba".equals(extension)) {
			return "audio/webm";
		}

		if ("webm".equals(extension)) {
			return "video/webm";
		}

		if ("webp".equals(extension)) {
			return "image/webp";
		}

		if ("wg".equals(extension)) {
			return "application/vnd.pmi.widget";
		}

		if ("wgt".equals(extension)) {
			return "application/widget";
		}

		if ("wks".equals(extension)) {
			return "application/vnd.ms-works";
		}

		if ("wm".equals(extension)) {
			return "video/x-ms-wm";
		}

		if ("wma".equals(extension)) {
			return "audio/x-ms-wma";
		}

		if ("wmd".equals(extension)) {
			return "application/x-ms-wmd";
		}

		if ("wmf".equals(extension)) {
			return "application/x-msmetafile";
		}

		// WML Source
		if ("wml".equals(extension)) {
			return "text/vnd.wap.wml";
		}

		// Compiled WML
		if ("wmlc".equals(extension)) {
			return "application/vnd.wap.wmlc";
		}

		// WML Script Source
		if ("wmls".equals(extension)) {
			return "text/vnd.wap.wmlscript";
		}

		// Compiled WML Script
		if ("wmlsc".equals(extension)) {
			return "application/vnd.wap.wmlscriptc";
		}

		if ("wmv".equals(extension)) {
			return "video/x-ms-wmv";
		}

		if ("wmx".equals(extension)) {
			return "video/x-ms-wmx";
		}

		if ("wmz".equals(extension)) {
			return "application/x-msmetafile";
		}

		if ("woff".equals(extension)) {
			return "application/x-font-woff";
		}

		if ("wpd".equals(extension)) {
			return "application/vnd.wordperfect";
		}

		if ("wpl".equals(extension)) {
			return "application/vnd.ms-wpl";
		}

		if ("wps".equals(extension)) {
			return "application/vnd.ms-works";
		}

		if ("wqd".equals(extension)) {
			return "application/vnd.wqd";
		}

		if ("wri".equals(extension)) {
			return "application/x-mswrite";
		}

		if ("wrl".equals(extension)) {
			return "model/vrml";
		}

		if ("wsdl".equals(extension)) {
			return "application/wsdl+xml";
		}

		if ("wspolicy".equals(extension)) {
			return "application/wspolicy+xml";
		}

		if ("wtb".equals(extension)) {
			return "application/vnd.webturbo";
		}

		if ("wvx".equals(extension)) {
			return "video/x-ms-wvx";
		}

		if ("x32".equals(extension)) {
			return "application/x-authorware-bin";
		}

		if ("x3d".equals(extension)) {
			return "model/x3d+xml";
		}

		if ("x3db".equals(extension)) {
			return "model/x3d+binary";
		}

		if ("x3dbz".equals(extension)) {
			return "model/x3d+binary";
		}

		if ("x3dv".equals(extension)) {
			return "model/x3d+vrml";
		}

		if ("x3dvz".equals(extension)) {
			return "model/x3d+vrml";
		}

		if ("x3dz".equals(extension)) {
			return "model/x3d+xml";
		}

		if ("xaml".equals(extension)) {
			return "application/xaml+xml";
		}

		if ("xap".equals(extension)) {
			return "application/x-silverlight-app";
		}

		if ("xar".equals(extension)) {
			return "application/vnd.xara";
		}

		if ("xbap".equals(extension)) {
			return "application/x-ms-xbap";
		}

		if ("xbd".equals(extension)) {
			return "application/vnd.fujixerox.docuworks.binder";
		}

		if ("xbm".equals(extension)) {
			return "image/x-xbitmap";
		}

		if ("xdf".equals(extension)) {
			return "application/xcap-diff+xml";
		}

		if ("xdm".equals(extension)) {
			return "application/vnd.syncml.dm+xml";
		}

		if ("xdp".equals(extension)) {
			return "application/vnd.adobe.xdp+xml";
		}

		if ("xdssc".equals(extension)) {
			return "application/dssc+xml";
		}

		if ("xdw".equals(extension)) {
			return "application/vnd.fujixerox.docuworks";
		}

		if ("xenc".equals(extension)) {
			return "application/xenc+xml";
		}

		if ("xer".equals(extension)) {
			return "application/patch-ops-error+xml";
		}

		if ("xfdf".equals(extension)) {
			return "application/vnd.adobe.xfdf";
		}

		if ("xfdl".equals(extension)) {
			return "application/vnd.xfdl";
		}

		if ("xht".equals(extension)) {
			return "application/xhtml+xml";
		}

		if ("xhtml".equals(extension)) {
			return "application/xhtml+xml";
		}

		if ("xhvml".equals(extension)) {
			return "application/xv+xml";
		}

		if ("xif".equals(extension)) {
			return "image/vnd.xiff";
		}

		if ("xla".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xlam".equals(extension)) {
			return "application/vnd.ms-excel.addin.macroenabled.12";
		}

		if ("xlc".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xlf".equals(extension)) {
			return "application/x-xliff+xml";
		}

		if ("xlm".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xls".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xlsb".equals(extension)) {
			return "application/vnd.ms-excel.sheet.binary.macroenabled.12";
		}

		if ("xlsm".equals(extension)) {
			return "application/vnd.ms-excel.sheet.macroenabled.12";
		}

		if ("xlsx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
		}

		if ("xlt".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xltm".equals(extension)) {
			return "application/vnd.ms-excel.template.macroenabled.12";
		}

		if ("xltx".equals(extension)) {
			return "application/vnd.openxmlformats-officedocument.spreadsheetml.template";
		}

		if ("xlw".equals(extension)) {
			return "application/vnd.ms-excel";
		}

		if ("xm".equals(extension)) {
			return "audio/xm";
		}

		if ("xml".equals(extension)) {
			return "application/xml";
		}

		if ("xo".equals(extension)) {
			return "application/vnd.olpc-sugar";
		}

		if ("xop".equals(extension)) {
			return "application/xop+xml";
		}

		if ("xpi".equals(extension)) {
			return "application/x-xpinstall";
		}

		if ("xpl".equals(extension)) {
			return "application/xproc+xml";
		}

		if ("xpm".equals(extension)) {
			return "image/x-xpixmap";
		}

		if ("xpr".equals(extension)) {
			return "application/vnd.is-xpr";
		}

		if ("xps".equals(extension)) {
			return "application/vnd.ms-xpsdocument";
		}

		if ("xpw".equals(extension)) {
			return "application/vnd.intercon.formnet";
		}

		if ("xpx".equals(extension)) {
			return "application/vnd.intercon.formnet";
		}

		if ("xsl".equals(extension)) {
			return "application/xml";
		}

		if ("xslt".equals(extension)) {
			return "application/xslt+xml";
		}

		if ("xsm".equals(extension)) {
			return "application/vnd.syncml+xml";
		}

		if ("xspf".equals(extension)) {
			return "application/xspf+xml";
		}

		if ("xul".equals(extension)) {
			return "application/vnd.mozilla.xul+xml";
		}

		if ("xvm".equals(extension)) {
			return "application/xv+xml";
		}

		if ("xvml".equals(extension)) {
			return "application/xv+xml";
		}

		if ("xwd".equals(extension)) {
			return "image/x-xwindowdump";
		}

		if ("xyz".equals(extension)) {
			return "chemical/x-xyz";
		}

		if ("xz".equals(extension)) {
			return "application/x-xz";
		}

		if ("yang".equals(extension)) {
			return "application/yang";
		}

		if ("yin".equals(extension)) {
			return "application/yin+xml";
		}

		if ("z".equals(extension)) {
			return "application/x-compress";
		}

		if ("Z".equals(extension)) {
			return "application/x-compress";
		}

		if ("z1".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z2".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z3".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z4".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z5".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z6".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z7".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("z8".equals(extension)) {
			return "application/x-zmachine";
		}

		if ("zaz".equals(extension)) {
			return "application/vnd.zzazz.deck+xml";
		}

		if ("zip".equals(extension)) {
			return "application/zip";
		}

		if ("zir".equals(extension)) {
			return "application/vnd.zul";
		}

		if ("zirz".equals(extension)) {
			return "application/vnd.zul";
		}

		if ("zmm".equals(extension)) {
			return "application/vnd.handheld-entertainment+xml";
		}
		return null;
	}
}
