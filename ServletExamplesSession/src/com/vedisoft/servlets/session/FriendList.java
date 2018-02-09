package com.vedisoft.servlets.session;

import java.util.ArrayList;

public class FriendList {

	ArrayList<Friend> friendList;

	public FriendList() {
		friendList = new ArrayList<Friend>();
	}

	public synchronized void create(String name, String phone) {
		Friend friend = new Friend(name, phone);
		friendList.add(friend);
	}

	public synchronized void edit(String name, String phone) {
		for (Friend friend : friendList) {
			if (friend.getName().equals(name)) {
				friend.setPhone(phone);
			}
		}
	}

	public synchronized void remove(String name) {
		for (int i = 0; i < friendList.size(); i++) {
			Friend friend = friendList.get(i);
			if (friend.getName().equals(name)) {
				friendList.remove(friend);
			}
		}
	}

	public synchronized ArrayList<Friend> getFriendList() {
		return friendList;
	}

}
