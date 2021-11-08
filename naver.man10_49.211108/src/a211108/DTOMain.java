package a211108;
import java.util.Arrays;
import java.util.Comparator;

public class DTOMain {

	public static void main(String[] args) {
		DTO[] ar = new DTO[3];
		
		ar[0] = new DTO();
		ar[0].setNumber(1);
		ar[0].setName("김백산");
		ar[0].setPrice(59000);
		
		ar[1] = new DTO();
		ar[1].setNumber(2);
		ar[1].setName("태백산");
		ar[1].setPrice(9000);
		
		ar[2] = new DTO();
		ar[2].setNumber(3);
		ar[2].setName("소백산");
		ar[2].setPrice(74000);
		
		for(DTO ro : ar) {
			System.out.println(ro.toString());
		}
			Arrays.sort(ar, new Comparator<DTO>() {

				@Override
				public int compare(DTO o1, DTO o2) {
					return o2.getNumber() - o1.getNumber();
				}
				
			});
			
			for(DTO ro : ar) {
				System.out.println(ro.toString());
			}
		
	}

}
