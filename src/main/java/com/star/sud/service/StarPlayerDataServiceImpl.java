package com.star.sud.service;

/*
 * @Author Sudarshan
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.star.sud.form.PlayerForm;

@Service("starPlayerDataService")
public class StarPlayerDataServiceImpl implements StarPlayerDataService {

	public List<PlayerForm> getPlayerData() {

		List<PlayerForm> playerList = new ArrayList<PlayerForm>();

		PlayerForm playerForm = new PlayerForm();
		playerForm.setId(1);
		playerForm.setName("Kohli");
		playerForm.setDesignation("Cricket");

		PlayerForm playerForm1 = new PlayerForm();
		playerForm1.setId(2);
		playerForm1.setName("Ranaldo");
		playerForm1.setDesignation("Footbal");

		playerList.add(playerForm);
		playerList.add(playerForm1);

		return playerList;

	}

}
