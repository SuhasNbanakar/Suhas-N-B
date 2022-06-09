package com.xworkz.persondetail;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.xworkz.persondetail.dto.AddressDTO;
import com.xworkz.persondetail.dto.PersonDTO;

public class PersonDetailRuling {

	public static void main(String[] agrs) {
		PersonDTO ddto1 = new PersonDTO(1, "Suhas", "kaadi@gmail.com", 80503192);
		PersonDTO ddto2 = new PersonDTO(2, "Pushpa", "pushpa@gmail.com", 77561200);
		PersonDTO ddto3 = new PersonDTO(3, "Nagraj ", "nagraj@gmail.com", 87145565);
		PersonDTO ddto4 = new PersonDTO(4, "Santosh", "santosh@gmail.com", 76441098);
		PersonDTO ddto5 = new PersonDTO(5, "Sandeep", "sandeep@gmail.com", 97649321);
		PersonDTO ddto6 = new PersonDTO(6, "Kavanna", "kavanna@gmail.com", 78288641);
		PersonDTO ddto7 = new PersonDTO(7, "ranjuu", "ran@gmail.com", 78599324);
		PersonDTO ddto8 = new PersonDTO(8, "Anusha", "anu@gmail.com", 567489983);
		PersonDTO ddto9 = new PersonDTO(9, "Joyti", "jyoti@gmail.com", 87002345);
		PersonDTO ddto10 = new PersonDTO(10, "Pramod", "promod@gmail.com", 768409121);

		PersonDTO ddto11 = new PersonDTO(11, "Sanjay", "sanjaym@gmail.com", 80113456);
		PersonDTO ddto12 = new PersonDTO(12, "Neelappa", "neelappa@gmail.com", 76894532);
		PersonDTO ddto13 = new PersonDTO(13, "Naajratna ", "naagratna@gmail.com", 78904532);
		PersonDTO ddto14 = new PersonDTO(14, "Pushpa", "pushpan@gmail.com", 76892100);
		PersonDTO ddto15 = new PersonDTO(15, "Manoj", "manojn@gmail.com", 898881201);
		PersonDTO ddto16 = new PersonDTO(16, "Meghna", "meghnasanju@gmail.com", 76809212);
		PersonDTO ddto17 = new PersonDTO(17, "Abhi", "abhi@gmail.com", 87903451);
		PersonDTO ddto18 = new PersonDTO(18, "jeevan", "jee@gmail.com", 657092345);
		PersonDTO ddto19 = new PersonDTO(19, "Pavan", "pavan@gmail.com", 998076442);
		PersonDTO ddto20 = new PersonDTO(20, "Brinda", "brinda@gmail.com", 869002645);

		PersonDTO ddto21 = new PersonDTO(21, "Laxmi", "laxmi@gmail.com", 879095421);
		PersonDTO ddto22 = new PersonDTO(22, "Mallappa", "mallappa@gmail.com", 76895021);
		PersonDTO ddto23 = new PersonDTO(23, "Rajsheckar", "raju@gmail.com", 76890453);
		PersonDTO ddto24 = new PersonDTO(24, "Rajeshwari", "raji@gmail.com", 768094532);
		PersonDTO ddto25 = new PersonDTO(25, "Sinchana", "sinch@gmail.com", 879076622);
		PersonDTO ddto26 = new PersonDTO(26, "Lalita", "lalita@gmail.com", 980877564);
		PersonDTO ddto27 = new PersonDTO(27, "Satwik", "satiwik@gmail.com", 89097421);
		PersonDTO ddto28 = new PersonDTO(28, "Shravani", "shravani@gmail.com", 98086751);
		PersonDTO ddto29 = new PersonDTO(29, "Mayura", "mayura@gamil.com", 87975551);
		PersonDTO ddto30 = new PersonDTO(30, "Prashant", "prassant@gmail.com", 980771123);

		PersonDTO ddto31 = new PersonDTO(31, "Shivkumar", "shiv@gmail.com", 980981277);
		PersonDTO ddto32 = new PersonDTO(32, "Sanjana", "sanjuu@gmail.com", 768900563);
		PersonDTO ddto33 = new PersonDTO(33, "chandrashecker", "chandshekar@gmail.com", 98901432);
		PersonDTO ddto34 = new PersonDTO(34, "Seema", "seema@gamil.com", 89707654);
		PersonDTO ddto35 = new PersonDTO(35, "Raj", "raj@gamil.com", 90871234);
		PersonDTO ddto36 = new PersonDTO(36, "Reema", "reem@gamil", 87901234);
		PersonDTO ddto37 = new PersonDTO(37, "Anushaa", "anushaa@gmail.com", 880977654);
		PersonDTO ddto38 = new PersonDTO(38, "Raniki", "raniki@gami.com", 890786754);
		PersonDTO ddto39 = new PersonDTO(39, "Shaan", "shaan@gamil.com", 980912345);
		PersonDTO ddto40 = new PersonDTO(40, "Shekhar", "shekhar@gmail.com", 77907564);

		PersonDTO ddto41 = new PersonDTO(41, "Shweta", "shweta@gmail.com", 878849321);
		PersonDTO ddto42 = new PersonDTO(42, "Nitin", "nitin@gmail.com", 797214566);
		PersonDTO ddto43 = new PersonDTO(43, "Savita", "savita@gmail.com", 89764231);
		PersonDTO ddto44 = new PersonDTO(44, "Bipin", "bipin@gmail.com", 98120989);
		PersonDTO ddto45 = new PersonDTO(45, "Shankar", "shankar@gmail.com", 897612075);
		PersonDTO ddto46 = new PersonDTO(46, "Pramila", "pramila@gmail.com", 98071234);
		PersonDTO ddto47 = new PersonDTO(47, "Yashshvi", "yashshvi@gmail.com", 879875423);
		PersonDTO ddto48 = new PersonDTO(48, "Shriyash", "shriyash@gmail.com", 988765109);
		PersonDTO ddto49 = new PersonDTO(49, "Nividita", "nivi@gmail.com", 909887123);
		PersonDTO ddto50 = new PersonDTO(50, "Lucky", "lucky@gmail.com", 989076543);

		PersonDTO ddto51 = new PersonDTO(51, "Rajsheekhar", "rajs@gmail.com", 909875132);
		PersonDTO ddto52 = new PersonDTO(52, "Rajii", "rajii@gmail.com", 908914528);
		PersonDTO ddto53 = new PersonDTO(53, "Shamiksha", "shamii@gmail.com", 908761256);
		PersonDTO ddto54 = new PersonDTO(54, "Anand", "anad@gmail.com", 90871108);
		PersonDTO ddto55 = new PersonDTO(55, "Bhumi", "bhumi@gmail.com", 908712667);
		PersonDTO ddto56 = new PersonDTO(56, "Sainil", "sai@gmail.com", 937029671);
		PersonDTO ddto57 = new PersonDTO(57, "Pranay", "pranay@gmail.com", 90761145);
		PersonDTO ddto58 = new PersonDTO(58, "Diksha", "diksha@gmail.com", 98712349);
		PersonDTO ddto59 = new PersonDTO(59, "Prema", "prema@gmail.com", 90875110);
		PersonDTO ddto60 = new PersonDTO(60, "Arun", "arun@gmail.com", 90807655);

		PersonDTO ddto61 = new PersonDTO(61, "Meghana B M", "meghanabmp@gmail.com", 987654311);
		PersonDTO ddto62 = new PersonDTO(62, "Priyanka B M", "priyanka@gmail.com", 987654312);
		PersonDTO ddto63 = new PersonDTO(63, "Pavithra B M", "pavi@gmail.com", 987654313);
		PersonDTO ddto64 = new PersonDTO(64, "Prajwal B M", "prajwal@gmail.com", 987654314);
		PersonDTO ddto65 = new PersonDTO(65, "Meenakshi", "menakshi@gmail.com", 987654315);
		PersonDTO ddto66 = new PersonDTO(66, "Manjunath", "manjunath@gmail.com", 987654316);
		PersonDTO ddto67 = new PersonDTO(67, "Suresh", "suresh@gmail.com", 987654317);
		PersonDTO ddto68 = new PersonDTO(68, "Geetha", "geetha@gmail.com", 987654318);
		PersonDTO ddto69 = new PersonDTO(69, "Jeevan", "jeevan@gmail.com", 987654319);
		PersonDTO ddto70 = new PersonDTO(70, "Paavan KS", "pavan@gmail.com", 987654320);

		PersonDTO ddto71 = new PersonDTO(71, "Ravi", "ravi@gmail.com", 987654321);
		PersonDTO ddto72 = new PersonDTO(72, "Giri", "giri@gmail.com", 987654322);
		PersonDTO ddto73 = new PersonDTO(73, "Preethi", "preethi@gmail.com", 987654323);
		PersonDTO ddto74 = new PersonDTO(74, "PavanKumar", "pavankumar@gmail.com", 987654324);
		PersonDTO ddto75 = new PersonDTO(75, "Shivaraj", "shivaraj@gmail.com", 987654325);
		PersonDTO ddto76 = new PersonDTO(76, "Manjunath", "manjunath@gmail.com", 987654326);
		PersonDTO ddto77 = new PersonDTO(77, "Sudha", "sudha@gmail.com", 987654327);
		PersonDTO ddto78 = new PersonDTO(78, "Sathvika", "sathvika@gmail.com", 987654328);
		PersonDTO ddto79 = new PersonDTO(79, "Chintu", "chintu@gmail.com", 987654329);
		PersonDTO ddto80 = new PersonDTO(80, "Chinnu", "chinnu@gmail.com", 987654330);

		PersonDTO ddto81 = new PersonDTO(81, "Ramesh", "ramesh@gmail.com", 987654331);
		PersonDTO ddto82 = new PersonDTO(82, "Renuka", "renuka@gmail.com", 987654332);
		PersonDTO ddto83 = new PersonDTO(83, "Sandeep B", "sandeep@gmail.com", 987654333);
		PersonDTO ddto84 = new PersonDTO(84, "Uday", "uday@gmail.com", 987654334);
		PersonDTO ddto85 = new PersonDTO(85, "Sathish", "sathish@gmail.com", 987654335);
		PersonDTO ddto86 = new PersonDTO(86, "Apeksha", "appi@gmail.com", 987654336);
		PersonDTO ddto87 = new PersonDTO(87, "Sindhu", "sindhu@gmail.com", 987654337);

		AddressDTO address1 = new AddressDTO(1, "Muddadavanarkere", 58, "Tittur");

		AddressDTO address2 = new AddressDTO(2, "Saraswatipuram", 404, "Birur");

		AddressDTO address3 = new AddressDTO(3, "Mahantesh Nagar", 201, "Ramdurg");

		AddressDTO address4 = new AddressDTO(4, "ShivajiChouck", 106, "Sirsi");

		AddressDTO address5 = new AddressDTO(5, "Pantbalekundri", 101, "Belgaum");

		AddressDTO address6 = new AddressDTO(6, "Temple Road", 68, "Kadur");

		AddressDTO address7 = new AddressDTO(7, "BTM", 99, "Bangalore");

		AddressDTO address8 = new AddressDTO(8, "Rajajinagar", 1001, "Bangalore");

		AddressDTO address9 = new AddressDTO(9, "Vijayanagar", 161, "Batkal");

		Map<PersonDTO, AddressDTO> map = new HashMap<PersonDTO, AddressDTO>();

		map.put(ddto1, address1);
		map.put(ddto2, address1);
		map.put(ddto3, address1);
		map.put(ddto4, address1);
		map.put(ddto5, address1);
		map.put(ddto6, address1);
		map.put(ddto7, address1);
		map.put(ddto8, address1);
		map.put(ddto9, address1);
		map.put(ddto10, address1);
		map.put(ddto11, address2);
		map.put(ddto12, address2);
		map.put(ddto13, address2);
		map.put(ddto14, address2);
		map.put(ddto15, address2);
		map.put(ddto16, address2);
		map.put(ddto17, address2);
		map.put(ddto18, address2);
		map.put(ddto19, address2);
		map.put(ddto20, address2);
		map.put(ddto21, address3);
		map.put(ddto22, address3);
		map.put(ddto23, address3);
		map.put(ddto25, address3);
		map.put(ddto26, address3);
		map.put(ddto27, address3);
		map.put(ddto28, address3);
		map.put(ddto29, address3);
		map.put(ddto30, address3);
		map.put(ddto31, address4);
		map.put(ddto32, address4);
		map.put(ddto33, address4);
		map.put(ddto34, address4);
		map.put(ddto35, address4);
		map.put(ddto36, address4);
		map.put(ddto37, address4);
		map.put(ddto38, address4);
		map.put(ddto39, address4);
		map.put(ddto40, address4);
		map.put(ddto41, address5);
		map.put(ddto42, address5);
		map.put(ddto43, address5);
		map.put(ddto44, address5);
		map.put(ddto45, address5);
		map.put(ddto46, address5);
		map.put(ddto47, address5);
		map.put(ddto48, address5);
		map.put(ddto49, address5);
		map.put(ddto50, address5);
		map.put(ddto51, address6);
		map.put(ddto52, address6);
		map.put(ddto53, address6);
		map.put(ddto54, address6);
		map.put(ddto55, address6);
		map.put(ddto56, address6);
		map.put(ddto57, address6);
		map.put(ddto58, address6);
		map.put(ddto59, address6);
		map.put(ddto60, address6);
		map.put(ddto61, address7);
		map.put(ddto62, address7);
		map.put(ddto63, address7);
		map.put(ddto64, address7);
		map.put(ddto65, address7);
		map.put(ddto66, address7);
		map.put(ddto67, address7);
		map.put(ddto68, address7);
		map.put(ddto69, address7);
		map.put(ddto70, address7);
		map.put(ddto71, address8);
		map.put(ddto72, address8);
		map.put(ddto73, address8);
		map.put(ddto74, address8);
		map.put(ddto75, address8);
		map.put(ddto76, address8);
		map.put(ddto77, address8);
		map.put(ddto78, address8);
		map.put(ddto79, address8);
		map.put(ddto80, address8);
		map.put(ddto81, address9);
		map.put(ddto82, address9);
		map.put(ddto83, address9);
		map.put(ddto84, address9);
		map.put(ddto85, address9);
		map.put(ddto86, address9);
		map.put(ddto87, address9);

		System.out.println("Sort in asc based on personDTO name");

		TreeMap<PersonDTO, AddressDTO> sortedMap = new TreeMap<PersonDTO, AddressDTO>(map);
		sortedMap.forEach((p, a) -> System.out.println(p.getName() + "   " + a.getCity()));

//		map.entrySet().stream().sorted((p, a) -> {
//			PersonDTO personDTO = p.getKey();
//			PersonDTO personDTO2 = a.getKey();
//			return personDTO.getName().compareTo(personDTO2.getName());
//		}).forEach(entry -> {
//			PersonDTO personDTO = entry.getKey();
//			AddressDTO addressDTO = entry.getValue();
//			System.out.println(personDTO.getName());
//		});

		System.out.println("address in ascending order");

		map.entrySet().stream().sorted((p, a) -> {
			AddressDTO dto1 = p.getValue();
			AddressDTO dto2 = a.getValue();
			return dto1.getId().compareTo(dto2.getId());
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(personDTO.getName() + "   " + addressDTO.getId());
		});

		System.out.println("find persondto by name and email\n");

		map.entrySet().stream().filter(entry -> {
			PersonDTO dto3 = entry.getKey();
			if (dto3.getName().equalsIgnoreCase("Laxmi") && dto3.getEmail().equalsIgnoreCase("laxmi@gmail.com")) {
				return true;
			}
			return false;
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(entry);
		});

		System.out.println("find all addressDTO by street and doorNo\n");

		map.entrySet().stream().filter(entry -> {
			AddressDTO dto4 = entry.getValue();
			if (dto4.getStreet().equalsIgnoreCase("ShivajiChouck") && dto4.getDoorNo().equals(106)) {
				return true;
			}
			return false;
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(entry);
		});
	}

}
