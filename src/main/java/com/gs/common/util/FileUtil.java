package com.gs.common.util;

import org.apache.commons.fileupload.FileItem;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * 上传文件工具类
 *
 */
public class FileUtil {
	
	public static String mkUpload(HttpServletRequest req) {
		String path = req.getServletContext().getRealPath("/");
		File file = new File(path, "images");
		if (!file.exists()) {
			file.mkdir();
		}
		return file.getAbsolutePath();
	}
	
	@SuppressWarnings("unused")
	public static void save(HttpServletRequest req, FileItem item) {
		try {
			InputStream in = item.getInputStream();
			byte[] bytes = new byte[1024];
			int total = -1;
			FileOutputStream out = new FileOutputStream(FileUtil.mkUpload(req) + "/" + item.getName());
			while ((total = in.read(bytes)) != -1) {
				out.write(bytes);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
