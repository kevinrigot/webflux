package be.qpact.webflux.demo.controller;

import be.qpact.webflux.demo.service.AssetService;
import be.qpact.webflux.demo.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.stream.Stream;

/**
 * Created by kevin on 20/05/17.
 */
@RestController
public class AssetController {

    @Autowired
    private AssetService assetService;
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE, value="/assets")
    public Flux<Asset> getAssets(){
        Stream<Asset> listOfAsset = assetService.getAssets().stream();
        Flux<Asset> flux = Flux.fromStream(listOfAsset);
        Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));
        return Flux.zip(flux,durationFlux).map(Tuple2::getT1);
    }
}
