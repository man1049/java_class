package a211112;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class DTO implements Serializable{
	private int num;
	private String name;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}

}


public class SerializableMain {

	public static void main(String[] args) {
		// 인스턴스 단위로 전송하기 위한 스트림 변수
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("./김백산.txt"));
			List<DTO> list = new ArrayList<>();
			DTO dto = new DTO();
			dto.setName("김백산");
			dto.setNum(1);

			list.add(dto);

			dto = new DTO();
			dto.setName("소백산");
			dto.setNum(2);

			list.add(dto);

			oos.writeObject(list);

		} catch (Exception e) {
			System.out.println("잘못된 경로");
		} finally {
			try {
				oos.close();
			} catch (Exception e) {	}
		}

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("./김백산.txt"));

			Object obj = ois.readObject();
			List<DTO> list = (List<DTO>)obj;

			//list = (List<DTO>) ois.readObject();

			for(DTO dtoget : list) {
				System.out.println(dtoget.getNum() + "\t" +  dtoget.getName());
			}

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				ois.close();
			} catch (Exception e) {	}
		}
		
		try(Scanner sc = new Scanner(System.in);){
			sc.next();
		}
		

	}
}
