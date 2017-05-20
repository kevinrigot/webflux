package be.qpact.webflux.demo.service;

import be.qpact.webflux.demo.model.Asset;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kevin on 20/05/17.
 */
@Service
public class AssetService {
    public List<Asset> getAssets(){
        List<Asset> listOfAssets = new ArrayList(Arrays.asList(
        new Asset("Renault", "Megane"),
                new Asset("Renault", "Clio"),
                new Asset("Renault", "Renault 5"),
                new Asset("Renault", "Dauphine"),
                new Asset("Renault", "Modus"),
                new Asset("Renault", "Avantime"),
                new Asset("Renault", "Vel Satis"),
                new Asset("Renault", "Alliance"),
                new Asset("Renault", "2CV"),
                new Asset("Renault", "Fuego"),
                new Asset("BMW", "M3"),
                new Asset("BMW", "3 Series"),
                new Asset("BMW", "X3"),
                new Asset("BMW", "Z4"),
                new Asset("BMW", "M5"),
                new Asset("BMW", "1 Series"),
                new Asset("BMW", "E9"),
                new Asset("BMW", "X6"),
                new Asset("BMW", "5 Series"),
                new Asset("BMW", "Z8"),
                new Asset("Holden", "Pontiac GTO"),
                new Asset("Holden", "Pontiac G8"),
                new Asset("Holden", "Holden Monaro"),
                new Asset("Holden", "Holden Commodore"),
                new Asset("Holden", "Holden Frontera")));
        return listOfAssets;
    }
}
