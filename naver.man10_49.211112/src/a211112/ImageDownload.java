package a211112;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			//다운받을 URL 생성
			URL url = new URL("https://mblogthumb-phinf.pstatic.net/MjAxNzA2MDZfMTgg/MDAxNDk2Njc2OTkyNTMw._OPryNhMZDvaXLke8uJZBgyUe98K_pZbDcSH99RJVtAg.Y4IbXPh36-fj06f243OJ1yECqmWbidDikppX1h6KTL4g.PNG.make1523/20170606_003540.png?type=w800");
			//연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//옵션 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);

			//이미지 파일이므로 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			
			//파일에 기록 할 스트림을 생성
			PrintStream ps = new PrintStream("./55도발왜하냐고.png");
			while(true) {
				//버퍼를 생성
				byte[] b = new byte[1024];
				//버퍼 크기만큼 읽기
				int len = bis.read(b);
				//읽은 데이터가 없으면 종료
				if(len <= 0) {
					break;
				}
				ps.write(b,0,len);
			}
			
			
			bis.close();
			con.disconnect();
		}catch(Exception e) {

		}finally {
			
		}

	}

}
