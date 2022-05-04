package com.xworkz.song.dao;

import com.xworkz.song.constants.Language;
import com.xworkz.song.dto.SongDTO;

public class SongDAO {

	public SongDTO[] dtos = new SongDTO[10];
	private int index;

	public boolean save(SongDTO dto) {
		System.out.println("Save the song dto");
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;
			System.out.println("running dto save " + dto);
			return true;
		} else {
			System.out.println("runninmg not save dto ");
		}
		return false;
	}

	public void saveMultiple(SongDTO[] dtos) {
		System.out.println("running save multiple ");
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto = dtos[index];
			this.save(dto);

		}
	}

	public boolean updateDurationByName(Double durationToUpdate, String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto1 = dtos[index];
			System.out.println("update duration");
			if (dto1.getName().equals(name)) {
				dto1.setDuration(durationToUpdate);
				System.out.println("update duration by name " + dto1);
				return true;
			}
		}
		System.out.println("duration not update");
		return false;
	}

	public boolean updateSingerNameByName(String SingerNameToUpdate, String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto2 = dtos[index];
			System.out.println("update Singername");
			if (dto2.getName().equals(name)) {
				dto2.setSingerName(SingerNameToUpdate);
				System.out.println("update Singername by name " + dto2);
				return true;
			}
		}
		System.out.println(" singername not update");
		return false;
	}

	public boolean updateNameById(String nameToUpdate, Integer id) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto3 = dtos[index];
			System.out.println("update name");
			if (dto3.getId().equals(id)) {
				dto3.setName(nameToUpdate);
				System.out.println("update name by id " + dto3);
				return true;
			}
		}
		System.out.println(" name not update");
		return false;
	}

	public Double findDurationByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto4 = dtos[index];
			System.out.println("running find duration ");
			if (dto4 != null && dto4.getName().equals(name)) {
				return dto4.getDuration();
			} else {
				System.out.println("duration not find");
			}
		}
		return 1.0d;
	}

	public String findSingerNameByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto5 = dtos[index];
			System.out.println("running find Singer name");
			if (dto5 != null && dto5.getName().equals(name)) {
				return dto5.getSingerName();
			} else {
				System.out.println("running not found singer name");
			}
		}
		return name;
	}

	public SongDTO findBySingerName(String singerName) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto6 = dtos[index];
			System.out.println("running find singer name ");
			if (dto6 != null && dto6.getSingerName().equals(singerName)) {
				System.out.println(dto6.getSingerName());
				return dto6;
			} else {
				System.out.println("running not find singer name ");
			}
		}
		return null;
	}

	public Language findLangByName(String name) {
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto7 = dtos[index];
			System.out.println("The Name is " + name);
			if (dto7.getName().equals(name)) {
				return dto7.getLang();
			} else {
				System.out.println("Name is Not Found");
			}
		}
		return null;
	}

	public Double findByMaxDuration() {
		double max = 0;
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto8 = dtos[index];
			double duration = dto8.getDuration();
			System.out.println(max + " " + duration);
			max = Math.max(max, duration);
		}
		return max;

	}

	public Double findByMinDuration() {
		double min = Double.MAX_VALUE;
		for (int index = 0; index < dtos.length; index++) {
			SongDTO dto9 = dtos[index];
			double duration = dto9.getDuration();
			System.out.println(min + " " + duration);
			min = Math.min(min, duration);
		}
		return min;

	}

	public SongDTO[] findTotal() {

		for (int index = 0; index < this.dtos.length; index++) {
			SongDTO dto10 = dtos[index];

			if (dto10.getClass() != null) {
				System.out.println("All Conditions are Satisfied");
				for (int repeat = 0; repeat < dtos.length; repeat++) {
					System.out.println(dtos[repeat]);
				}
				return dtos;
			} else {
				System.out.println("Cannot find The Cake");
			}

		}
		return null;

	}
}
