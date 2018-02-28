package com.mtz.controller;
import java.io.IOException;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
public class MainController {
	@FXML
	private AnchorPane apane;
	@FXML
	private Label ksqx;
	@FXML
	private Label yxjl;
	@FXML
	private Label tcyx;
	String file = MainController.class.getResource("/com/mtz/music/login.mp3").toString();  
	Media media = new Media(file);  
	MediaPlayer mp2 = new MediaPlayer(media);
	
	public void initialize() {
		addmp3();
		inin();
	}
	public void inin(){
		tcyx.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				System.exit(0);
			}
		});
		ksqx.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				mp2.stop();
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/com/mtz/view/Run.fxml"));
					Scene scene = new Scene(root); 
					Stage stage  = new Stage();
					stage.initStyle(StageStyle.DECORATED);  
			        stage.setScene(scene);  
			        stage.setTitle("¿ªÊ¼ÓÎÏ·");  
			        stage.show();
			        tcyx.getScene().getWindow().hide();
			        stage.getScene().getWindow()
					.setOnHidden(new EventHandler<WindowEvent>() {
						public void handle(WindowEvent arg0) {
							//System.exit(0);
						}
					});
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public void addmp3(){
		mp2.setAutoPlay(true);
		MediaView  mv = new MediaView(mp2); 
		apane.getChildren().add(mv);
	}
}
