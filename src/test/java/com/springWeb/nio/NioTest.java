package com.springWeb.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月27日 下午4:36:10
 * @desc:
 * 
 */
public class NioTest extends TestCase {
	@Test
	public void testName() throws Exception {
		RandomAccessFile aFile = new RandomAccessFile("testData/nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buf);

		while (bytesRead != -1) {
			System.out.println("read " + bytesRead);
			buf.flip();

			while (buf.hasRemaining()) {
				System.out.println((char) buf.get());
			}

			buf.clear();
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}
}
