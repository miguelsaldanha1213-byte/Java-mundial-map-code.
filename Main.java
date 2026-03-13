import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.OsmTileFactoryInfo;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MapaMundiJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("World map Java");
        JXMapViewer mapa = new JXMapViewer();

        TileFactoryInfo info = new OsmTileFactoryInfo();
        DefaultTileFactory fabricaDeTiles = new DefaultTileFactory(info);
        mapa.setTileFactory(fabricaDeTiles);

        GeoPosition posicaoCentral = new GeoPosition(0, 0);
        mapa.setAddressLocation(posicaoCentral);
        mapa.setZoom(15);

        frame.setLayout(new BorderLayout());
        frame.add(mapa, BorderLayout.CENTER);
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
0
