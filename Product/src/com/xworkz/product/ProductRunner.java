package com.xworkz.product;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.order.ProductCompanyAsc;
import com.xworkz.product.order.ProductCompanyDesc;
import com.xworkz.product.order.ProductIdAscComp;
import com.xworkz.product.order.ProductIdDescComp;
import com.xworkz.product.order.ProductNameAsc;
import com.xworkz.product.order.ProductNameDesc;
import com.xworkz.product.order.ProductPriceAsc;
import com.xworkz.product.order.ProductPriceDesc;
import com.xworkz.product.order.ProductQualityAsc;
import com.xworkz.product.order.ProductQualityDesc;
import com.xworkz.product.order.ProductQuantityAsc;
import com.xworkz.product.order.ProductQuantityDesc;

public class ProductRunner {

	public static void main(String[] args) {

		ProductDTO pDto = new ProductDTO(1, "Shoes", "Sparx", 5, 120D, 3f);
		ProductDTO pDto1 = new ProductDTO(2, "shoEs", "Puma", 6, 130D, 3.5f);
		ProductDTO pDto2 = new ProductDTO(3, "Shoes", "Nivia", 10, 140D, 4f);
		ProductDTO pDto3 = new ProductDTO(4, "Shoes", "Lancer", 11, 150D, 5f);
		ProductDTO pDto4 = new ProductDTO(5, "shoes", "Bourge", 16, 160D, 3.5f);
		ProductDTO pDto5 = new ProductDTO(6, "SHoes", "Swiggy", 17, 120D, 4f);
		ProductDTO pDto6 = new ProductDTO(7, "ShOes", "Longwalk", 4, 140D, 4f);
		ProductDTO pDto7 = new ProductDTO(8, "ShoEs", "Kats", 8, 150D, 3f);
		ProductDTO pDto8 = new ProductDTO(9, "ShoeS", "Generic", 12, 220D, 3.5f);
		ProductDTO pDto9 = new ProductDTO(10, "Shsmpoo", "Vatika", 15, 420D, 4f);
		ProductDTO pDto10 = new ProductDTO(12, "ShsMpoo", "Himalaya", 14, 170D, 3f);
		ProductDTO pDto11 = new ProductDTO(13, "ShsmpOo", "Dove", 13, 110D, 4.5f);
		ProductDTO pDto12 = new ProductDTO(14, "SHsmpoo", "Pantene", 15, 180D, 4.5f);
		ProductDTO pDto13 = new ProductDTO(15, "ShSmpoo", "Kesh Kanti", 18, 120D, 4f);
		ProductDTO pDto14 = new ProductDTO(16, "ShsmpoO", "Fructis", 11, 190D, 5f);
		ProductDTO pDto15 = new ProductDTO(17, "shsmpoo", "Sunsilk", 9, 220D, 3.6f);
		ProductDTO pDto16 = new ProductDTO(18, "ShsmPoo", "Loreal", 10, 210D, 3f);
		ProductDTO pDto17 = new ProductDTO(19, "SHSmpoo", "Beer", 11, 120D, 4.6f);
		ProductDTO pDto18 = new ProductDTO(20, "ShsmpOO", "HeadAndShoulders", 21, 320D, 4.5f);
		ProductDTO pDto19 = new ProductDTO(21, "Shirt", "Allen Solly", 13, 2430D, 3.5f);
		ProductDTO pDto20 = new ProductDTO(22, "SHirt", "Tommy Hilfiger", 17, 3330D, 5f);
		ProductDTO pDto21 = new ProductDTO(23, "ShIrt", "levi Strauss", 12, 2320D, 3.4f);
		ProductDTO pDto22 = new ProductDTO(24, "ShiRt", "Louis Philippe", 4, 1240D, 3.8f);
		ProductDTO pDto23 = new ProductDTO(25, "ShirT", "peter England", 8, 1250D, 4f);
		ProductDTO pDto24 = new ProductDTO(26, "shirt", "Adidas", 6, 1190D, 4.5f);
		ProductDTO pDto25 = new ProductDTO(27, "SHIrt", "Raymond", 8, 2280D, 3.5f);
		ProductDTO pDto26 = new ProductDTO(28, "ShiRT", "Gucci", 5, 3395D, 3f);
		ProductDTO pDto27 = new ProductDTO(29, "Shirt", "Burberry", 9, 1170D, 5f);
		ProductDTO pDto28 = new ProductDTO(30, "sHirt", "Jhon Players", 12, 12180D, 3f);
		ProductDTO pDto29 = new ProductDTO(31, "shirT", "Lacoste", 11, 32140D, 4.5f);
		ProductDTO pDto30 = new ProductDTO(30, "watch", "CREATURE", 39, 390D, 4.5F);
		ProductDTO pDto31 = new ProductDTO(31, "watch", "Fastrack", 40, 400D, 5.5F);
		ProductDTO pDto32 = new ProductDTO(32, "watch", "Amazfit", 41, 410D, 3.5F);
		ProductDTO pDto33 = new ProductDTO(33, "watch", "WildHorn", 42, 420D, 2.5F);
		ProductDTO pDto34 = new ProductDTO(34, "watch", "NAPA HIDE", 43, 430D, 4.5F);
		ProductDTO pDto35 = new ProductDTO(35, "BackPacks", "American Tourister", 44, 440D, 3.5F);
		ProductDTO pDto36 = new ProductDTO(36, "BackPacks", "Safari", 45, 450D, 2.5F);
		ProductDTO pDto37 = new ProductDTO(37, "BackPacks", "Genie", 46, 460D, 3.5F);
		ProductDTO pDto38 = new ProductDTO(38, "BackPacks", "Zipline", 47, 470D, 4.5F);
		ProductDTO pDto39 = new ProductDTO(39, "BackPacks", "Gear", 48, 480D, 2.5F);
		ProductDTO pDto40 = new ProductDTO(40, "Belts", "CREATURE", 49, 490D, 3.5F);

		ProductDTO pDto41 = new ProductDTO(41, "Belts", "Labnoft", 50, 500D, 4.5F);
		ProductDTO pDto42 = new ProductDTO(42, "Belts", "ZORO", 51, 510D, 2.5F);
		ProductDTO pDto43 = new ProductDTO(43, "Belts", "URBAN FOREST", 52, 520D, 3.5F);
		ProductDTO pDto44 = new ProductDTO(44, "Belts", "HIDE & SKIN", 53, 530D, 4.5F);
		ProductDTO pDto45 = new ProductDTO(45, "Cap", "DRUNKEN", 54, 540D, 2.5F);
		ProductDTO pDto46 = new ProductDTO(46, "Cap", "ELK", 55, 550D, 3.5F);
		ProductDTO pDto47 = new ProductDTO(47, "Cap", "GUSTAVE", 56, 560D, 4.5F);
		ProductDTO pDto48 = new ProductDTO(48, "Cap", "Handcuffs", 57, 570D, 5.0F);
		ProductDTO pDto49 = new ProductDTO(49, "Cap", "Knotyy", 58, 580D, 4.5F);
		ProductDTO pDto50 = new ProductDTO(50, "Cap", "Aavjo", 59, 590D, 3.5F);

		ProductDTO pDto51 = new ProductDTO(51, "Cap", "VRITRAZ", 60, 600D, 2.5F);
		ProductDTO pDto52 = new ProductDTO(52, "Cap", "Eforstore", 61, 610D, 4.5F);
		ProductDTO pDto53 = new ProductDTO(53, "Cap", "Seibertron", 62, 620D, 2.5F);
		ProductDTO pDto54 = new ProductDTO(54, "Cap", "Hupshy", 63, 630D, 3.5F);
		ProductDTO pDto55 = new ProductDTO(55, "Cap", "HIVER", 64, 640D, 2.5F);
		ProductDTO pDto56 = new ProductDTO(56, "Cap", "CREATURE", 65, 650D, 4.5F);
		ProductDTO pDto57 = new ProductDTO(57, "SunGlass", "Fastrack", 66, 660D, 4.5F);
		ProductDTO pDto58 = new ProductDTO(58, "SunGlass", "BLACK JONES", 67, 670D, 4.5F);
		ProductDTO pDto59 = new ProductDTO(59, "SunGlass", "Black Jones", 68, 680D, 2.5F);
		ProductDTO pDto60 = new ProductDTO(60, "SunGlass", "EFERMONE", 69, 690D, 3.5F);

		ProductDTO pDto61 = new ProductDTO(61, "SunGlass", "VINCENT CHASE EYEWEAR", 70, 700D, 4.5F);
		ProductDTO pDto62 = new ProductDTO(62, "Curtains", "Home Sizzler", 71, 710D, 2.5F);
		ProductDTO pDto63 = new ProductDTO(63, "Curtains", "Homefab India", 72, 720D, 3.5F);
		ProductDTO pDto64 = new ProductDTO(64, "Curtains", "Kuber Industries", 73, 730D, 4.5F);
		ProductDTO pDto65 = new ProductDTO(65, "Curtains", "Urban Space", 75, 740D, 2.5F);
		ProductDTO pDto66 = new ProductDTO(66, "Curtains", "LaVichitra", 76, 750D, 3.5F);
		ProductDTO pDto67 = new ProductDTO(67, "Curtains", "Curtain King", 77, 760D, 4.5F);
		ProductDTO pDto68 = new ProductDTO(68, "Curtains", "Story@Home", 78, 770D, 2.5F);
		ProductDTO pDto69 = new ProductDTO(69, "WallClock", "Shoefly", 79, 780D, 4.5F);
		ProductDTO pDto70 = new ProductDTO(70, "WallClock", "Webelkart", 80, 790D, 2.5F);

		ProductDTO pDto71 = new ProductDTO(71, "WallClock", "JaipurCrafts", 81, 800D, 3.5F);
		ProductDTO pDto72 = new ProductDTO(72, "Shoes", "TIED RIBBONS", 82, 810D, 4.5F);
		ProductDTO pDto73 = new ProductDTO(73, "WallClock", "De'rons", 83, 820D, 2.5F);
		ProductDTO pDto74 = new ProductDTO(74, "WallClock", "OREVA", 84, 830D, 3.5F);
		ProductDTO pDto75 = new ProductDTO(75, "WallClock", "Oreva", 85, 840D, 4.5F);
		ProductDTO pDto76 = new ProductDTO(76, "Photoframes", "rt Street", 86, 850D, 2.5F);
		ProductDTO pDto77 = new ProductDTO(77, "Photoframes", "VAH- Kya Bat Hai ", 87, 860D, 3.5F);
		ProductDTO pDto78 = new ProductDTO(78, "Photoframes", "GFTBX", 88, 870D, 4.5F);
		ProductDTO pDto79 = new ProductDTO(79, "Photoframes", "Painting Mantra", 89, 880D, 2.5F);
		ProductDTO pDto80 = new ProductDTO(80, "Photoframes", "PAPER PLANE DESIGN", 90, 890D, 2.5F);

		ProductDTO pDto81 = new ProductDTO(81, "Photoframes", "Incredible Gifts India", 91, 900D, 3.5F);
		ProductDTO pDto82 = new ProductDTO(82, "Photoframes", "Generic", 92, 910D, 4.5F);
		ProductDTO pDto83 = new ProductDTO(83, "Photoframes", "Amazon Brand - Solimo", 93, 920D, 2.5F);
		ProductDTO pDto84 = new ProductDTO(84, "Photoframes", "Photo Factory", 94, 930D, 3.5F);
		ProductDTO pDto85 = new ProductDTO(85, "Photoframes", "Plan To Gift", 95, 940D, 3.5F);
		ProductDTO pDto86 = new ProductDTO(86, "Photoframes", "Hem Jewels", 96, 950D, 2.5F);
		ProductDTO pDto87 = new ProductDTO(87, "Photoframes", "Stealodeal", 97, 960D, 4.5F);
		ProductDTO pDto88 = new ProductDTO(88, "Idols", "Collectible India", 98, 970D, 3.5F);
		ProductDTO pDto89 = new ProductDTO(89, "Idols", "SHARABANI", 99, 980D, 4.5F);
		ProductDTO pDto90 = new ProductDTO(90, "Idols", "TIED RIBBONS", 100, 990D, 2.5F);

		ProductDTO pDto91 = new ProductDTO(91, "Idols", "HC VILLA", 101, 1000D, 2.5F);
		ProductDTO pDto92 = new ProductDTO(92, "Idols", "PAPER PLANE DESIGN", 102, 1100D, 2.5F);
		ProductDTO pDto93 = new ProductDTO(93, "Idols", "Goldiluxe", 103, 1200D, 3.5F);
		ProductDTO pDto94 = new ProductDTO(94, "Idols", "PARADIGM PICTURES", 104, 1300D, 4.5F);
		ProductDTO pDto95 = new ProductDTO(95, "Idols", "iDream", 105, 1400D, 3.5F);
		ProductDTO pDto96 = new ProductDTO(96, "Idols", "Divya Mantra", 106, 1500D, 4.5F);
		ProductDTO pDto97 = new ProductDTO(97, "Idols", "SAUDEEP INDIA", 107, 1600D, 2.5F);
		ProductDTO pDto98 = new ProductDTO(98, "Idols", "SHOP END HERE", 108, 1700D, 3.5F);
		ProductDTO pDto99 = new ProductDTO(99, "Carpets", "Shoefly", 109, 1800D, 4.5F);
		ProductDTO pDto100 = new ProductDTO(100, "Carpets", "AAZEEM", 110, 1900D, 4.5F);

		ProductDTO pDto101 = new ProductDTO(101, "Carpets", "ATMAH", 111, 2000D, 4.5F);
		ProductDTO pDto102 = new ProductDTO(102, "Carpets", "SARAL HOME EASY LIVING", 112, 2100D, 2.5F);
		ProductDTO pDto103 = new ProductDTO(103, "Carpets", "SHF", 113, 2200D, 4.5F);
		ProductDTO pDto104 = new ProductDTO(104, "Carpets", "DAILZ", 114, 2300D, 3.5F);
		ProductDTO pDto105 = new ProductDTO(105, "Carpets", "Status Contract", 115, 2400D, 4.5F);
		ProductDTO pDto106 = new ProductDTO(106, "DoorMats", "AAZEEM", 116, 2500D, 3.5F);
		ProductDTO pDto107 = new ProductDTO(107, "DoorMats", "ATMAH", 116, 2600D, 4.5F);
		ProductDTO pDto108 = new ProductDTO(108, "DoorMats", "SHF", 117, 2700D, 4.5F);
		ProductDTO pDto109 = new ProductDTO(109, "DoorMats", "Status Contract", 118, 2800D, 4.5F);
		ProductDTO pDto110 = new ProductDTO(110, "DoorMats", "Shankara", 119, 2900D, 4.5F);

		ProductDTO pDto111 = new ProductDTO(111, "DoorMats", "amazelo cart", 120, 3000D, 3.5F);
		ProductDTO pDto112 = new ProductDTO(112, "DoorMats", "Generic", 121, 3100D, 4.5F);
		ProductDTO pDto113 = new ProductDTO(113, "DoorMats", "Kuber Industries", 122, 3200D, 3.5F);
		ProductDTO pDto114 = new ProductDTO(114, "DoorMats", "Amazon Brand - Solimo", 123, 3300D, 4.5F);
		ProductDTO pDto115 = new ProductDTO(115, "DoorMats", "Onlymat", 124, 3400D, 3.5F);
		ProductDTO pDto116 = new ProductDTO(116, "DoorMats", "Fernish Decor", 125, 3500D, 4.5F);
		ProductDTO pDto117 = new ProductDTO(117, "DoorMats", "C&G INDIA", 126, 3600D, 2.5F);
		ProductDTO pDto118 = new ProductDTO(118, "Cofee Table", "Esquire", 127, 3700D, 4.5F);
		ProductDTO pDto119 = new ProductDTO(119, "Cofee Table", "Nilkamal", 128, 3800D, 2.5F);
		ProductDTO pDto120 = new ProductDTO(120, "Cofee Table", "Priti", 129, 3900D, 4.5F);

		ProductDTO pDto121 = new ProductDTO(121, "Cofee Table", "DECORVAIZ", 130, 4000D, 2.5F);
		ProductDTO pDto122 = new ProductDTO(122, "Cofee Table", "VDIX", 131, 4100D, 4.5F);
		ProductDTO pDto123 = new ProductDTO(123, "Cofee Table", "Heera Moti", 132, 4200D, 2.5F);
		ProductDTO pDto124 = new ProductDTO(124, "Cofee Table", "Cello", 133, 4300D, 4.5F);
		ProductDTO pDto125 = new ProductDTO(125, "TvUnit", "AAROORA", 134, 4400D, 2.5F);
		ProductDTO pDto126 = new ProductDTO(126, "TvUnit", "BLUEWUD", 135, 4500D, 4.5F);
		ProductDTO pDto127 = new ProductDTO(127, "TvUnit", "Home Sparkle", 136, 4600D, 2.5F);
		ProductDTO pDto128 = new ProductDTO(128, "TvUnit", "DeckUp", 137, 4700D, 4.5F);
		ProductDTO pDto129 = new ProductDTO(129, "TvUnit", "Anikaa", 138, 4800D, 2.5F);
		ProductDTO pDto130 = new ProductDTO(130, "GasStove", "Butterfly", 139, 4900D, 4.5F);

		ProductDTO pDto131 = new ProductDTO(131, "GasStove", "Lifelong", 140, 5000D, 2.5F);
		ProductDTO pDto132 = new ProductDTO(132, "GasStove", "Prestige", 141, 5100D, 4.5F);
		ProductDTO pDto133 = new ProductDTO(133, "GasStove", "Elica", 142, 5200D, 2.5F);
		ProductDTO pDto134 = new ProductDTO(134, "GasStove", "Pigeon", 143, 5300D, 4.5F);
		ProductDTO pDto135 = new ProductDTO(135, "GasStove", "SUNFLAME", 144, 5400D, 2.5F);
		ProductDTO pDto136 = new ProductDTO(136, "Mugs", "Pure Source India", 145, 5500D, 4.5F);
		ProductDTO pDto137 = new ProductDTO(137, "Mugs", "The Purple Tree", 146, 5600D, 2.5F);
		ProductDTO pDto138 = new ProductDTO(138, "Mugs", "Boosty", 147, 5700D, 4.5F);
		ProductDTO pDto139 = new ProductDTO(139, "Mugs", "Tuelip", 148, 5800D, 2.5F);
		ProductDTO pDto140 = new ProductDTO(140, "Mugs", "exciting Lives", 149, 5900D, 4.5F);

		ProductDTO pDto141 = new ProductDTO(141, "Mugs", "Indigifts", 150, 6000D, 2.5F);
		ProductDTO pDto142 = new ProductDTO(142, "Mugs", "PUREZENTO", 151, 6100D, 4.5F);
		ProductDTO pDto143 = new ProductDTO(143, "LED Bulb", "PHILIPS", 152, 6200D, 2.5F);
		ProductDTO pDto144 = new ProductDTO(144, "LED Bulb", "wipro", 153, 6300D, 4.5F);
		ProductDTO pDto145 = new ProductDTO(145, "LED Bulb", "SYSKA", 154, 6400D, 2.5F);
		ProductDTO pDto146 = new ProductDTO(146, "LED Bulb", "Halonix", 155, 6500D, 4.5F);
		ProductDTO pDto147 = new ProductDTO(147, "LED Bulb", "Desidiya", 156, 6600D, 2.5F);
		ProductDTO pDto148 = new ProductDTO(148, "LED Bulb", "Mufasa", 157, 6700D, 4.5F);
		ProductDTO pDto149 = new ProductDTO(149, "LED Bulb", "Havells", 158, 6800D, 3.5F);

		ProductDTO pDto150 = new ProductDTO(150, "LED Bulb", "Ikea", 39, 6900D, 4.5F);

		List<ProductDTO> prod = new LinkedList<ProductDTO>();
		prod.add(pDto1);
		prod.add(pDto2);
		prod.add(pDto3);
		prod.add(pDto4);
		prod.add(pDto5);
		prod.add(pDto6);
		prod.add(pDto7);
		prod.add(pDto8);
		prod.add(pDto9);
		prod.add(pDto10);

		prod.add(pDto11);
		prod.add(pDto12);
		prod.add(pDto13);
		prod.add(pDto14);
		prod.add(pDto15);
		prod.add(pDto16);
		prod.add(pDto17);
		prod.add(pDto18);
		prod.add(pDto19);
		prod.add(pDto20);

		prod.add(pDto21);
		prod.add(pDto22);
		prod.add(pDto23);
		prod.add(pDto24);
		prod.add(pDto25);
		prod.add(pDto26);
		prod.add(pDto27);
		prod.add(pDto28);
		prod.add(pDto29);
		prod.add(pDto30);

		prod.add(pDto31);
		prod.add(pDto32);
		prod.add(pDto33);
		prod.add(pDto34);
		prod.add(pDto35);
		prod.add(pDto36);
		prod.add(pDto37);
		prod.add(pDto38);
		prod.add(pDto39);
		prod.add(pDto40);

		prod.add(pDto41);
		prod.add(pDto42);
		prod.add(pDto43);
		prod.add(pDto44);
		prod.add(pDto45);
		prod.add(pDto46);
		prod.add(pDto47);
		prod.add(pDto48);
		prod.add(pDto49);
		prod.add(pDto50);

		prod.add(pDto51);
		prod.add(pDto52);
		prod.add(pDto53);
		prod.add(pDto54);
		prod.add(pDto55);
		prod.add(pDto56);
		prod.add(pDto57);
		prod.add(pDto58);
		prod.add(pDto59);
		prod.add(pDto60);

		prod.add(pDto61);
		prod.add(pDto62);
		prod.add(pDto63);
		prod.add(pDto64);
		prod.add(pDto65);
		prod.add(pDto66);
		prod.add(pDto67);
		prod.add(pDto68);
		prod.add(pDto69);
		prod.add(pDto70);

		prod.add(pDto71);
		prod.add(pDto72);
		prod.add(pDto73);
		prod.add(pDto74);
		prod.add(pDto75);
		prod.add(pDto76);
		prod.add(pDto77);
		prod.add(pDto78);
		prod.add(pDto79);
		prod.add(pDto80);

		prod.add(pDto81);
		prod.add(pDto82);
		prod.add(pDto83);
		prod.add(pDto84);
		prod.add(pDto85);
		prod.add(pDto86);
		prod.add(pDto87);
		prod.add(pDto88);
		prod.add(pDto89);
		prod.add(pDto90);

		prod.add(pDto91);
		prod.add(pDto92);
		prod.add(pDto93);
		prod.add(pDto94);
		prod.add(pDto95);
		prod.add(pDto96);
		prod.add(pDto97);
		prod.add(pDto98);
		prod.add(pDto99);
		prod.add(pDto100);

		prod.add(pDto101);
		prod.add(pDto102);
		prod.add(pDto103);
		prod.add(pDto104);
		prod.add(pDto105);
		prod.add(pDto106);
		prod.add(pDto107);
		prod.add(pDto108);
		prod.add(pDto109);
		prod.add(pDto110);

		prod.add(pDto111);
		prod.add(pDto112);
		prod.add(pDto113);
		prod.add(pDto114);
		prod.add(pDto115);
		prod.add(pDto116);
		prod.add(pDto117);
		prod.add(pDto118);
		prod.add(pDto119);
		prod.add(pDto120);

		prod.add(pDto121);
		prod.add(pDto122);
		prod.add(pDto123);
		prod.add(pDto124);
		prod.add(pDto125);
		prod.add(pDto126);
		prod.add(pDto127);
		prod.add(pDto128);
		prod.add(pDto129);
		prod.add(pDto130);

		prod.add(pDto131);
		prod.add(pDto132);
		prod.add(pDto133);
		prod.add(pDto134);
		prod.add(pDto135);
		prod.add(pDto136);
		prod.add(pDto137);
		prod.add(pDto138);
		prod.add(pDto139);
		prod.add(pDto140);

		prod.add(pDto141);
		prod.add(pDto142);
		prod.add(pDto143);
		prod.add(pDto144);
		prod.add(pDto145);
		prod.add(pDto146);
		prod.add(pDto147);
		prod.add(pDto148);
		prod.add(pDto149);
		prod.add(pDto150);

		System.out.println("==========Id Increment=============");
		Comparator<ProductDTO> idAsc = new ProductIdAscComp();
		Collections.sort(prod, idAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Id Decrement=============");

		Comparator<ProductDTO> idDsc = new ProductIdDescComp();
		Collections.sort(prod, idDsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Name Increment=============");

		Comparator<ProductDTO> namAsc = new ProductNameAsc();
		Collections.sort(prod, namAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Name Decrement=============");

		Comparator<ProductDTO> namDesc = new ProductNameDesc();
		Collections.sort(prod, namDesc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Company Increment=============");

		Comparator<ProductDTO> comAsc = new ProductCompanyAsc();
		Collections.sort(prod, comAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Company Decrement=============");

		Comparator<ProductDTO> comDesc = new ProductCompanyDesc();
		Collections.sort(prod, comDesc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Quantity Increment=============");

		Comparator<ProductDTO> quanAsc = new ProductQuantityAsc();
		Collections.sort(prod, quanAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Quantity Decrement=============");

		Comparator<ProductDTO> quanDesc = new ProductQuantityDesc();
		Collections.sort(prod, quanDesc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);

		}
		System.out.println("========== Price Increment=============");

		Comparator<ProductDTO> priAsc = new ProductPriceAsc();
		Collections.sort(prod, priAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Price Decrement=============");

		Comparator<ProductDTO> priDesc = new ProductPriceDesc();
		Collections.sort(prod, priDesc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Quality Increment=============");

		Comparator<ProductDTO> quaAsc = new ProductQualityAsc();
		Collections.sort(prod, quaAsc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}
		System.out.println("==========Quality Decrement=============");

		Comparator<ProductDTO> quaDesc = new ProductQualityDesc();
		Collections.sort(prod, quaDesc);
		for (ProductDTO productDTO : prod) {
			System.out.println(productDTO);
		}

	}

}
