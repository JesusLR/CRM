package Library;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Uploadimage extends javax.swing.JFrame {
	private File archivo;
	private JFileChooser abrirArchivo;
	private static String urlOrigen=null;
	
	public void CargarImagen(JLabel label) {
		abrirArchivo=new JFileChooser();
		abrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png", "gif"));
		int respuesta=abrirArchivo.showOpenDialog(this);
		if(respuesta==JFileChooser.APPROVE_OPTION) {
			archivo=abrirArchivo.getSelectedFile();
			Image foto = getToolkit().getImage(urlOrigen);
			foto = foto.getScaledInstance(240, 170, 1);
			label.setIcon(new ImageIcon(foto));
		}
	}

}
