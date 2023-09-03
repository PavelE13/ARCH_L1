package InMemoryModel;

import ModelElements.*;

public class ModelStore implements IModelChanger {

    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera camera;
    private IModelChangerObserver changeObserver;

    public ModelStore(PoligonalModel models, Scene scenes, Flash flashes, Camera cameras, IModelChangerObserver changeObserver) {
        this.models = new PoligonalModel(new Poligon());
        this.scenes = new Scene(this.models, this.flashes, this.camera);
        this.flashes = new Flash();
        this.camera = new Camera();
        this.changeObserver = changeObserver;
    }

    public Scene getScena(int n) {
        return this.scenes;
    }
    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
