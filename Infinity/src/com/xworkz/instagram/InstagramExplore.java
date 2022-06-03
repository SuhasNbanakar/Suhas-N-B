package com.xworkz.instagram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramExplore {

	public static void main(String[] args) {

		InstagramDTO insta1 = new InstagramDTO("Suhas", 450, 5, "kadda", 340);
		InstagramDTO insta2 = new InstagramDTO("Laxmi", 623, 25, "Rashmi", 520);
		InstagramDTO insta3 = new InstagramDTO("Shweta", 550, 31, "Sweety", 450);
		InstagramDTO insta4 = new InstagramDTO("pratheek", 650, 15, "loverboy", 710);
		InstagramDTO insta5 = new InstagramDTO("Xworkzbtm", 750, 309, "Xworkzodc", 1000);

		List<InstagramDTO> instagram = Arrays.asList(insta1, insta2, insta3, insta4, insta5);

		boolean ans = instagram.stream().allMatch(temp -> Character.isUpperCase(temp.compareTo(insta1)));
		System.out.println(ans);

		boolean ans1 = instagram.stream().anyMatch(temp1 -> instagram.equals(insta1));
		System.out.println(ans1);

		long ans3 = instagram.stream().count();
		System.out.println(ans3);

		int ans4 = instagram.stream().hashCode();
		System.out.println(ans4);

		Optional<InstagramDTO> ans5 = instagram.stream().findAny();
		System.out.println(ans5);

//		instagram.stream().equals(insta1);

	}

}
