package net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//file 전송 [Server] - FTP Server
public class file_server {
	public static void main(String[] args) {
		new ftp_server(10100);
	}
}


class ftp_server{
	int p = 0;
	Socket sk = null;
	ServerSocket ss = null;
	InputStream is = null;
	FileOutputStream fs = null;
	
	public ftp_server(int port) {
		this.p = port;
		this.data();
	}
	
	private void data() {
		try {
			this.ss = new ServerSocket(this.p);
			this.sk = this.ss.accept();
			System.out.println("*******서버 가동 중********");
			String url = "D:\\ftp\\";	// Client가 전송한 파일 저장소
			
			// Client가 전송한 파일을 읽어들여서 Check
			this.is = this.sk.getInputStream();
			byte data[] = new byte[2097152];
//			this.is.read(data);
			
			// Server에 저장하는 코드
			this.fs = new FileOutputStream(url + "data.jpg");
			int filesize = 0;
			while((filesize = this.is.read(data)) != -1)
			{
				this.fs.write(data,0,filesize);
				this.fs.flush();				
			}
			System.out.println("정상적으로 업로드 완료 되었습니다.");
			
			this.fs.close();
			this.is.close();
			this.sk.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Port 충돌로 인하여 서버 오류 발생!!");
		}
	}
	
}