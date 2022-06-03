package com.xworkz.instagram.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InstagramDTO implements Serializable, Comparable<InstagramDTO> {

	private String name;
	private Integer noOfFollowers;
	private Integer noOfPosts;
	private String nickName;
	private Integer noOfFollowing;

	@Override
	public int compareTo(InstagramDTO o) {
		if (o != null && o.getName() != null) {

		}
		return this.name.compareTo(o.getName());
	}
}
