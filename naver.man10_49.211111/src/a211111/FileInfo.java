package a211111;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		//절대 경로를 가지고 File 인스턴스를 생성
		File f = new File("C:\\Users\\tj\\Desktop\\abc.txt");
		
		if(f.exists() == true) {
			System.out.println("파일이 있습니다.");
			//파일의 마지막 수정시간
			long time = f.lastModified();
			//epoch time을 Date로 변환
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String result = sdf.format(date);
			System.out.println(time);
			System.out.println(date);
			System.out.println(result);
			//파일의 크기를 출력
			System.out.println(f.length()/1024/1024+"mb");
			//상대 경로인 현재 디렉토리의 절대경로 확인
			f = new File("./");
			System.out.println(f.getAbsolutePath());
			f = new File("./abc.txt");
			System.out.println(f.exists());
		}else {
			System.out.println("파일이 없습니다");
		}

	}

}
