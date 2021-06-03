public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

	MelonType musk = new MelonType(
		"musk",
		"Muskmelon",
		1998,
		"green",
		True,
		True
	);
	MelonType casaba = new MelonType(
		"cas",
		"Casaba",
		2003,
		"orange",
		True,
		True
	);

	MelonType crenshaw = new MelonType(
		"cren",
		"Crenshaw",
		1996,
		"green",
		True,
		False
	);

	MelonType yellwat = new MelonType(
		"yw",
		"Yellow Watermenlon",
		2013,
		"yellow",
		True,
		False
	);
	MelonType[] melonTypes = {musk, casaba, crenshaw, yellwat};
	
	Melon melon1 = new Melon(melonTypes [3], 8, 7, 2, "Sheila");

	
	
	
}
}	
	

