package org.inusara.main;

public class Main {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Basit, komut satirli hesap makinesi.\n\nKomutlar:\n y : Klasik yardim komutu.\n h <ilk-deger> <son-deger> <islem> : Hesaplama yapma komutu. \n  -- <islem> bolumune <t> (toplama), <c> (cikarma), <ca> (carpma), <b> (bolme) ve <us> (us alma) gelmesi gerekiyor.\n th <ilk-deger> <islem> : Tek degerle yapilan hesaplama komutu.\n  -- <islem> bolumune <k>(degerin karesi), <kk>(degerin karekoku) gelmesi gerekiyor.\nTrigonometri Komutlari:\n sin <deger>\n cos <deger>\n tan <deger>\n cot <deger>\n\nOrnek kullanim:\n java -jar sarac.jar h 4 5 t\n java -jar sarac.jar th 4 k\n");
		} else if(args[0].equals("y")) {
			System.out.println("Basit, komut satirli hesap makinesi.\n\nKomutlar:\n y : Klasik yardim komutu.\n h <ilk-deger> <son-deger> <islem> : Hesaplama yapma komutu. \n  -- <islem> bolumune <t> (toplama), <c> (cikarma), <ca> (carpma), <b> (bolme) ve <us> (us alma) gelmesi gerekiyor.\n th <ilk-deger> <islem> : Tek degerle yapilan hesaplama komutu.\n  -- <islem> bolumune <k>(degerin karesi), <kk>(degerin karekoku) gelmesi gerekiyor.\nTrigonometri Komutlari:\n sin <deger>\n cos <deger>\n tan <deger>\n cot <deger>\n\nOrnek kullanim:\n java -jar sarac.jar h 4 5 t\n java -jar sarac.jar th 4 k\n");
		} else if(args[0].equals("h")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				double ikinciDeger = Double.parseDouble(args[2]);
				if(args[3].equals("t")) {
					double sonuc = ilkDeger + ikinciDeger;
					System.out.println("\nIslem sonucu: " + sonuc + "\n");
				} else if (args[3].equals("c")) {
					double sonuc = ilkDeger - ikinciDeger;
					System.out.println("\nIslem sonucu: " + sonuc + "\n");
				} else if (args[3].equals("ca")) {
					double sonuc = ilkDeger * ikinciDeger;
					System.out.println("\nIslem sonucu: " + sonuc + "\n");
				} else if (args[3].equals("b")) {
					double sonuc = ilkDeger / ikinciDeger;
					System.out.println("\nIslem sonucu: " + sonuc + "\n");
				} else if(args[3].equals("us")) {
					double sonuc = Math.pow(ilkDeger, ikinciDeger);
					System.out.println("\nIslem sonucu: " + sonuc + "\n");
				} else {
					System.out.println("Hatali arguman");
				}
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
		} else if(args[0].equals("th")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				if(args[2].equals("k")) {
					double sonuc = ilkDeger * ilkDeger;
					System.out.println("\nIslemin sonucu: " + sonuc + "\n");
				} else if(args[2].equals("kk")) {
					if(ilkDeger < 0) {
						System.out.println("Karekokun degeri negatif olamaz!");
					} else {
					double sonuc = Math.pow(ilkDeger, 0.5);
					System.out.println("\nIslemin sonucu: " + sonuc + "\n");
					}
				} else {
					System.out.println("Hatali arguman");
				}
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
				
			
		} else if (args[0].equals("sin")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				double sonuc = Math.sin(ilkDeger*(Math.PI/180));
				System.out.println("\nIslemin sonucu: " + sonuc + "\n");
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
		} else if (args[0].equals("cos")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				double sonuc = Math.cos(ilkDeger*(Math.PI/180));
				System.out.println("\nIslemin sonucu: " + sonuc + "\n");
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
		} else if (args[0].equals("cot")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				double sonuc = Math.cos(ilkDeger*(Math.PI/180))/Math.sin(ilkDeger*(Math.PI/180));
				System.out.println("\nIslemin sonucu: " + sonuc + "\n");
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
		} else if (args[0].equals("tan")) {
			try {
				double ilkDeger = Double.parseDouble(args[1]);
				double sonuc = Math.tan(ilkDeger*(Math.PI/180));
				System.out.println("\nIslemin sonucu: " + sonuc + "\n");
			} catch (Exception e) {
				System.out.println("Lutfen komutu tam girin!");
			}
		} else {
		
			System.out.println("Hatali komut");
		}
	}

}
