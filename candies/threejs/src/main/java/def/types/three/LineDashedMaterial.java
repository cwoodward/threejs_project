package def.types.three;
public class LineDashedMaterial extends Material {
    public LineDashedMaterial(LineDashedMaterialParameters parameters){}
    public Color color;
    public double linewidth;
    public double scale;
    public double dashSize;
    public double gapSize;
    native public void setValues(LineDashedMaterialParameters parameters);
    public LineDashedMaterial(){}
}

