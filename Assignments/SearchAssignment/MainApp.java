package exercise;

public class MainApp {

	public static void main(String[] args) {
		
		Integer integer1 =1;
		Integer integer2 =2;
		Integer integer3 =3;
		Integer integer4 =4;
		Integer integer5 =5;
		
		Object[] obj = new Object[5];
		
		obj[0] = integer1;
		obj[1] = integer2;
		obj[2] = integer3;
		obj[3] = integer4;
		obj[4] = integer5;
		
		Integer finding_key =2;
		
		IntegerSearch IS = new IntegerSearch();
		
		if(IS.search(obj , finding_key)) {
			System.out.println("found "+finding_key);
		}
		else {
			System.out.println("Not Found");
		}

		String string1 = "Mumbai";
		String string2 = "Hyderabad";
		String string3 = "Chennai";
		String string4 = "Kolkata";
		String string5 = "Pune";
		
		Object[] sub = new Object[5];
		
		sub[0] = string1;
		sub[1] = string2;
		sub[2] = string3;
		sub[3] = string4;
		sub[4] = string5;
		
		String finding_string = "Chennai";
		
		StringSearch SS = new StringSearch();
		if(SS.search(sub,finding_string)) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
}
