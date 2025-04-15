package salford.ThreeDApp;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class ThreeDApp extends Application{
	Scene scene;
	Pane pane;
	
	PerspectiveCamera camera;
	Box box;
	
	
	double x=0, y=0, z=0, phi=0;

	EventHandler<KeyEvent> kHandler = new EventHandler<KeyEvent>() {

		@Override
		public void handle(KeyEvent arg0) {
			if(arg0.getCode()==KeyCode.D)
				phi+=1;
			if(arg0.getCode()==KeyCode.A)
				phi-=1;
			if(arg0.getCode()==KeyCode.W)
			{
				x+=Math.sin(phi/180.0*Math.PI);
				z+=Math.cos(phi/180.0*Math.PI);
			}
			if(arg0.getCode()==KeyCode.S)
			{
				x-=Math.sin(phi/180.0*Math.PI);
				z-=Math.cos(phi/180.0*Math.PI);
			}
			camera.setRotate(phi);
			camera.setTranslateX(x);
			camera.setTranslateY(y);
			camera.setTranslateZ(z);
		
		} };
	

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My 3D app");
		pane = new Pane();
		scene = new Scene(pane, 800, 600, true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
    	camera = new PerspectiveCamera(true);
    	scene.setCamera(camera);
    	
    	box = new Box(1, 1, 1);
    	pane.getChildren().add(box);
    	
	box.setTranslateX(0);
	box.setTranslateY(0);
	box.setTranslateZ(5);
	box.setRotationAxis(new Point3D(0,1,0));
	box.setRotate(45);
	
	PhongMaterial material = new PhongMaterial();

	Image texture = new Image(getClass().getResourceAsStream("linuximg.png"));
	
	material.setDiffuseMap(texture);
	box.setMaterial(material);
	
	Group g = new Group();
	
	Sphere s = new Sphere(0.5); // radius
	s.setTranslateX(-5);
	s.setMaterial(material);
	
	Cylinder c = new Cylinder(0.3, 1); // radius, length
	c.setTranslateX(1);
	c.setMaterial(material);
	
	g.getChildren().add(s);
		g.getChildren().add(c);
	
		g.setTranslateX(2);
		g.setTranslateY(0);
		g.setTranslateZ(10);
	
		pane.getChildren().add(g);


		camera.setRotationAxis(new Point3D(0,1,0));
		scene.setOnKeyPressed(kHandler);

	

	}
}
