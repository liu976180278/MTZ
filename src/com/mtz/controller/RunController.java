package com.mtz.controller;

import java.io.IOException;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class RunController {
	@FXML
	private Label grade;
	private static int gradeNum = 0;
	@FXML
	private Label time;
	private static final int timeNum2 = 100;
	private static int timeNum = 100;
	@FXML
	private ImageView carImage;// ��ͼ ���184
	@FXML
	private TextField aaa;// �����¼�����Ҫ��
	@FXML
	private ImageView zha1;// ը��һ ���35
	@FXML
	private ImageView zha2;// ը����
	@FXML
	private ImageView zha3;// ը��һ
	@FXML
	private ImageView jin1;// ���һ
	@FXML
	private ImageView jin2;// ��Ҷ�
	@FXML
	private ImageView jin3;// �����
	private static int change = 1; // ����ͼƬ����Ķ�̬ͼ
	private static int change2 = 5; // ����ͼƬ����Ķ�̬ͼ
	private static Boolean flag = true; // Ϊtrue�����ұ߿���
	// ��Ϸ�е�����
	String file = MainController.class.getResource("/com/mtz/music/ing.mp3")
			.toString();
	Media media = new Media(file);
	MediaPlayer mpIng = new MediaPlayer(media);
	// ��Ϸ����������
	String file2 = MainController.class.getResource("/com/mtz/music/Stop.mp3")
			.toString();
	Media media2 = new Media(file2);
	MediaPlayer mpstorp = new MediaPlayer(media2);
	// ��Ϸ�е�����
	String jin = MainController.class.getResource("/com/mtz/music/jingbi.mp3")
				.toString();
	Media mediajin = new Media(jin);
	// ��ʱ��
	Timer timer = new Timer();
	// ��Һ�ը��xiahua�Ĺ켣
	TimerTask changezhajin = null;
	// ʱ�䵽�� ����Ϸʤ��
	TimerTask mytimer = new TimerTask() {
		public void run() {
			Platform.runLater(new Runnable() {
				public void run() {
					time.setText(timeNum + "");
					timeNum--;
					if (timeNum == 0) {
						mytimer.cancel();
						changezhajin.cancel();
						zhaCarTimer.cancel();
						mpIng.stop();
						mpstorp.setAutoPlay(true);
						time.setText(0 + "");
						timeNum = timeNum2;
						gradeNum=0;
						Alert alert = new Alert(AlertType.CONFIRMATION);
						alert.setTitle("��ʾ");
						alert.setHeaderText("��Ϸ�ɹ�,�ص���ҳ��");
						Optional<ButtonType> result = alert.showAndWait();
						if (result.get() == ButtonType.OK) {
							mpstorp.stop();
							try {
								Parent root = FXMLLoader
										.load(getClass().getResource(
												"/com/mtz/view/Main.fxml"));
								Scene scene = new Scene(root);
								Stage stage = new Stage();
								stage.initStyle(StageStyle.DECORATED);
								stage.setScene(scene);
								stage.setTitle("��ʼ��Ϸ");
								stage.show();
								scene.getStylesheets().add(
										getClass().getResource(
												"/com/mtz/main/main.css")
												.toExternalForm());
								time.getScene().getWindow().hide();
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
						} else {
							System.exit(0);
						}
					}
				}
			});
		}
	};

	// ը����������
	TimerTask zhaCarTimer = new TimerTask() {
		@Override
		public void run() {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					if (zha1.getY() > 320 && zha1.getY() < 380) {
						Double ZanX = zha1.getX();
						Double ZanW = zha1.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							zhaCarTimer.cancel();
							changezhajin.cancel();
							mytimer.cancel();
							mytimer.cancel();
							mpIng.stop();
							mpstorp.setAutoPlay(true);
							timeNum = timeNum2;
							gradeNum=0;
							Alert alert = new Alert(AlertType.CONFIRMATION);
							alert.setTitle("��Ϸʧ��");
							alert.setHeaderText("��Ϸʧ��,�ص���ҳ��");
							Optional<ButtonType> result = alert.showAndWait();
							if (result.get() == ButtonType.OK) {
								mpstorp.stop();
								mpstorp.setAutoPlay(true);
								try {
									Parent root = FXMLLoader.load(getClass()
											.getResource(
													"/com/mtz/view/Main.fxml"));
									Scene scene = new Scene(root);
									Stage stage = new Stage();
									stage.initStyle(StageStyle.DECORATED);
									stage.setScene(scene);
									stage.setTitle("��ʼ��Ϸ");
									stage.show();
									scene.getStylesheets().add(
											getClass().getResource(
													"/com/mtz/main/main.css")
													.toExternalForm());
									time.getScene().getWindow().hide();
								} catch (IOException e) {
									System.out.println(e.getMessage());
								}
							} else {
								System.exit(0);
							}
						}
					}
					if (zha2.getY() > 320 && zha2.getY() < 380) {
						Double ZanX = zha2.getX();
						Double ZanW = zha2.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							zhaCarTimer.cancel();
							changezhajin.cancel();
							mytimer.cancel();
							mytimer.cancel();
							mpIng.stop();
							mpstorp.setAutoPlay(true);
							timeNum = timeNum2;
							gradeNum=0;
							Alert alert = new Alert(AlertType.CONFIRMATION);
							alert.setTitle("��Ϸʧ��");
							alert.setHeaderText("��Ϸʧ��,�ص���ҳ��");
							Optional<ButtonType> result = alert.showAndWait();
							if (result.get() == ButtonType.OK) {
								mpstorp.stop();
								mpstorp.setAutoPlay(true);
								try {
									Parent root = FXMLLoader.load(getClass()
											.getResource(
													"/com/mtz/view/Main.fxml"));
									Scene scene = new Scene(root);
									Stage stage = new Stage();
									stage.initStyle(StageStyle.DECORATED);
									stage.setScene(scene);
									stage.setTitle("��ʼ��Ϸ");
									stage.show();
									scene.getStylesheets().add(
											getClass().getResource(
													"/com/mtz/main/main.css")
													.toExternalForm());
									time.getScene().getWindow().hide();
								} catch (IOException e) {
									System.out.println(e.getMessage());
								}
							} else {
								System.exit(0);
							}
						}
					}
					if (zha3.getY() > 320 && zha3.getY() < 380) {
						Double ZanX = zha3.getX();
						Double ZanW = zha3.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							zhaCarTimer.cancel();
							changezhajin.cancel();
							mytimer.cancel();
							mytimer.cancel();
							mpIng.stop();
							mpstorp.setAutoPlay(true);
							timeNum = timeNum2;
							gradeNum=0;
							Alert alert = new Alert(AlertType.CONFIRMATION);
							alert.setTitle("��Ϸʧ��");
							alert.setHeaderText("��Ϸʧ��,�ص���ҳ��");
							Optional<ButtonType> result = alert.showAndWait();
							if (result.get() == ButtonType.OK) {
								mpstorp.stop();
								mpstorp.setAutoPlay(true);
								try {
									Parent root = FXMLLoader.load(getClass()
											.getResource(
													"/com/mtz/view/Main.fxml"));
									Scene scene = new Scene(root);
									Stage stage = new Stage();
									stage.initStyle(StageStyle.DECORATED);
									stage.setScene(scene);
									stage.setTitle("��ʼ��Ϸ");
									stage.show();
									scene.getStylesheets().add(
											getClass().getResource(
													"/com/mtz/main/main.css")
													.toExternalForm());
									time.getScene().getWindow().hide();
								} catch (IOException e) {
									System.out.println(e.getMessage());
								}
							} else {
								System.exit(0);
							}
						}
					}
				}
			});
		}
	};

	TimerTask jinCarTimer = new TimerTask() {
		@Override
		public void run() {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					if (jin1.getY() > 320 && jin1.getY() < 380) {
						Double ZanX = jin1.getX();
						Double ZanW = jin1.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							gradeNum=gradeNum+100;
							grade.setText(gradeNum+"");
							MediaPlayer mpjin = new MediaPlayer(mediajin);
							mpjin.play();
							jin1.setY(0.0);
							jin1.setX(Math.random() * 470);
						}
					}
					if (jin2.getY() > 320 && jin2.getY() < 380) {
						Double ZanX = jin2.getX();
						Double ZanW = jin2.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							gradeNum=gradeNum+100;
							grade.setText(gradeNum+"");
							MediaPlayer mpjin = new MediaPlayer(mediajin);
							mpjin.play();
							jin2.setY(0.0);
							jin2.setX(Math.random() * 470);
						}
					}
					if (jin3.getY() > 320 && jin3.getY() < 380) {
						Double ZanX = jin3.getX();
						Double ZanW = jin3.getFitWidth();
						Double CarX = carImage.getX();
						Double CarW = carImage.getFitWidth();
						if (((ZanX + ZanW - 20) > CarX)
								&& (ZanX < (CarX + CarW - 65))) {
							gradeNum=gradeNum+100;
							grade.setText(gradeNum+"");
							MediaPlayer mpjin = new MediaPlayer(mediajin);
							mpjin.play();
							jin3.setY(0.0);
							jin3.setX(Math.random() * 470);
						}
					}
				}
			});
		}
	};

	public void initialize() {
		mpIng.setAutoPlay(true);
		zhaJin();
		startzhajin();
		zhaCar();
		jinCar();
		TimeTimer();
		aaa.requestFocus();
		inin();
	}

	public void inin() {
		changeCarTimer();
		aaa.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent arg0) {
				if (arg0.getCode() == KeyCode.LEFT) {
					flag = true;
					if (carImage.getX() > 0.0) {
						carImage.setX(carImage.getX() - 5);
					}
				} else if (arg0.getCode() == KeyCode.RIGHT) {
					flag = false;
					if (carImage.getX() < 470) {
						carImage.setX(carImage.getX() + 5);
					}
				}
			}
		});
	}


	public void zhaJin() {
		carImage.setX(Math.random() * 470);
		zha1.setX(Math.random() * 470);// 0��470
		zha2.setX(Math.random() * 470);// 0��470
		zha3.setX(Math.random() * 470);// 0��470
		jin1.setX(Math.random() * 470);// 0��470
		jin2.setX(Math.random() * 470);// 0��470
		jin3.setX(Math.random() * 470);// 0��470
		changezhajin(zha1, 3 + Math.random() * 7, zha2, 3 + Math.random() * 7,
				zha3, 3 + Math.random() * 7, jin1, 3 + Math.random() * 7, jin2,
				3 + Math.random() * 7, jin3, 3 + Math.random() * 7);
	}

	// ը�� �ͽ�ҵ��»�
	public void changezhajin(ImageView image1, Double Y1, ImageView image2,
			Double Y2, ImageView image3, Double Y3, ImageView image4,
			Double Y4, ImageView image5, Double Y5, ImageView image6, Double Y6) {
		changezhajin = new TimerTask() {
			public void run() {
				Platform.runLater(new Runnable() {
					public void run() {
						if (image1.getY() > 400) {
							image1.setY(0.0);
							image1.setX(Math.random() * 470);
						}
						if (image2.getY() > 400) {
							image2.setY(0.0);
							image2.setX(Math.random() * 470);
						}
						if (image3.getY() > 400) {
							image3.setY(0.0);
							image3.setX(Math.random() * 470);
						}
						if (image4.getY() > 400) {
							image4.setY(0.0);
							image4.setX(Math.random() * 470);
						}
						if (image5.getY() > 400) {
							image5.setY(0.0);
							image5.setX(Math.random() * 470);
						}
						if (image6.getY() > 400) {
							image6.setY(0.0);
							image6.setX(Math.random() * 470);
						}
						image1.setY(image1.getY() + Y1);
						image2.setY(image2.getY() + Y2);
						image3.setY(image3.getY() + Y3);
						image4.setY(image4.getY() + Y4);
						image5.setY(image5.getY() + Y5);
						image6.setY(image6.getY() + Y6);
					}
				});
			}
		};
	}

	// ��true ����Ϊ����
	public void changeCarTimer() {
		timer.schedule(new TimerTask() {
			public void run() {
				Platform.runLater(new Runnable() {
					public void run() {
						if (flag) {
							carImage.setImage(new Image(
									RunController.class
											.getResource(
													"/com/mtz/image/" + change
															+ ".png")
											.toExternalForm()));
							change = change + 1;
							if (change > 4) {
								change = 1;
							}
						} else {
							carImage.setImage(new Image(RunController.class
									.getResource(
											"/com/mtz/image/" + change2
													+ ".png").toExternalForm()));
							change2 = change2 + 1;
							if (change2 > 8) {
								change2 = 5;
							}
						}
						changeCarTimer();
					}
				});
			}
		}, 200);
	}

	// ����ʱ�� ʱ�䳬��3������ͨ��
	public void TimeTimer() {
		try {
			timer.schedule(mytimer, 0, 1000);
		} catch (Exception e) {
			System.out.println("TimeTimer����ʱ�� ʱ�䳬��3������ͨ��");
		}
	}

	public void zhaCar() {
		timer.schedule(zhaCarTimer, 0, 50);
	}
	public void jinCar() {
		timer.schedule(jinCarTimer, 0, 50);
	}
	public void startzhajin() {
		timer.schedule(changezhajin, 0, 100);
	}
}
