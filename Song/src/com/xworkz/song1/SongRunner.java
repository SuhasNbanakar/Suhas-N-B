package com.xworkz.song1;

import com.xworkz.song.constants.Language;
import com.xworkz.song.dao.SongDAO;
import com.xworkz.song.dto.SongDTO;

public class SongRunner {

	public static void main(String[] args) {

		SongDTO song = new SongDTO();

		song.setId(1);
		song.setName("go carona go carona");
		song.setSingerName("Rj Ramesh");
		song.setDuration(4.30d);
		song.setYear(2019);
		song.setLang(Language.KANNADA);

		SongDAO songDAO = new SongDAO();
		boolean temp = songDAO.save(song);
		System.out.println(temp);

		SongDTO song1 = new SongDTO();

		song1.setId(2);
		song1.setName("Mehaboba");
		song1.setSingerName("Ananyabhat");
		song1.setDuration(4.22d);
		song1.setYear(2021);
		song1.setLang(Language.KANNADA);

		SongDTO song2 = new SongDTO();

		song2.setId(3);
		song2.setName("Naatu Naatu");
		song2.setSingerName("Rahul Sipligunj");
		song2.setDuration(3.29d);
		song2.setYear(2022);
		song2.setLang(Language.TELUGU);

		SongDTO song3 = new SongDTO();
		song3.setId(4);
		song3.setName("Mazhai Kuruvi");
		song3.setSingerName("A R Rahman");
		song3.setDuration(5.48d);
		song3.setYear(2018);
		song3.setLang(Language.TAMIL);

		SongDTO song4 = new SongDTO();
		song4.setId(5);
		song4.setName("Dingiri Dingale");
		song4.setSingerName("Dulquer Salmann");
		song4.setDuration(3.12d);
		song4.setYear(2022);
		song4.setLang(Language.MALYALAM);

		SongDTO song5 = new SongDTO();
		song5.setId(6);
		song5.setName("Senorita");
		song5.setSingerName("Camila Cabello");
		song5.setDuration(3.26d);
		song5.setYear(2016);
		song5.setLang(Language.ENGLISH);

		SongDTO song6 = new SongDTO();
		song6.setId(7);
		song6.setName("Nenjukul Peidhidum");
		song6.setSingerName("Hariharan");
		song6.setDuration(5.40d);
		song6.setYear(2008);
		song6.setLang(Language.TAMIL);

		SongDTO song7 = new SongDTO();
		song7.setId(8);
		song7.setName("Buttabomma");
		song7.setSingerName("Armaan Malik");
		song7.setDuration(4.31d);
		song7.setYear(2020);
		song7.setLang(Language.TELUGU);

		SongDTO song8 = new SongDTO();
		song8.setId(9);
		song8.setName("The Lazy");
		song8.setSingerName("Bruno Mars");
		song8.setDuration(3.20d);
		song8.setYear(2010);
		song8.setLang(Language.ENGLISH);

		SongDTO song9 = new SongDTO();
		song9.setId(10);
		song9.setName("Neeyilla Neram");
		song9.setSingerName("Sooraj S");
		song9.setDuration(4.03d);
		song9.setYear(2019);
		song9.setLang(Language.MALYALAM);

		SongDTO[] temp1 = { song1, song2, song3, song4, song5, song6, song7, song8, song9 };
		songDAO.saveMultiple(temp1);

		System.out.println("********************************************");

		boolean temp2 = songDAO.updateDurationByName(3.56d, "Nenjukul Peidhidum");
		System.out.println(temp2);

		System.out.println("********************************************");

		boolean temp3 = songDAO.updateSingerNameByName("suhas", "The Lazy");
		System.out.println(temp3);

		System.out.println("********************************************");

		boolean temp4 = songDAO.updateNameById("carona go", 1);
		System.out.println(temp4);

		System.out.println("********************************************");

		double temp5 = songDAO.findDurationByName("Naatu Naatu");
		System.out.println(temp5);

		System.out.println("********************************************");

		String temp6 = songDAO.findSingerNameByName("Naatu Naatu");
		System.out.println(temp6);

		System.out.println("********************************************");

		SongDTO temp7 = songDAO.findBySingerName("Sooraj S");
		System.out.println(temp7);

		System.out.println("********************************************");

		Language temp8 = songDAO.findLangByName("Bruno Mars");
		System.out.println(temp8);

		System.out.println("********************************************");

		Double temp9 = songDAO.findByMaxDuration();
		System.out.println(temp9);

		System.out.println("********************************************");

		Double temp10 = songDAO.findByMaxDuration();
		System.out.println(temp10);

		System.out.println("********************************************");

		SongDTO[] temp11 = songDAO.findTotal();
		System.out.println(temp11);
	}

}
