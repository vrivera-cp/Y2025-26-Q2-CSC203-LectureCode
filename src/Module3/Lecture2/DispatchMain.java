package Module3.Lecture2;

public class DispatchMain {
    public static void main(String[] args) {
        // Instantiation
        ComponentVector cv = new ComponentVector(1, 1);
        MagnitudeVector mv = new MagnitudeVector(Math.sqrt(2), Math.PI / 4);

        Vector vcv = new ComponentVector(1, 1);
        Vector vmv = new MagnitudeVector(Math.sqrt(2), Math.PI / 4);

        // Default Method
        IO.println(cv.getDirectionInRadians());
        IO.println(mv.getDirectionInRadians());

        IO.println(vcv.getDirectionInRadians());
        IO.println(vmv.getDirectionInRadians());

        // Method Dispatch
        ComponentVector cv1 = new ComponentVector(1, 1);
        ComponentVector cv2 = new ComponentVector(1, 1);

        MagnitudeVector mv1 = new MagnitudeVector(Math.sqrt(2), Math.PI / 4);
        MagnitudeVector mv2 = new MagnitudeVector(Math.sqrt(2), Math.PI / 4);

        Vector vcv1 = new ComponentVector(1, 1);
        Vector vcv2 = new ComponentVector(1, 1);

        VectorUtil.add(cv1, cv2);
        VectorUtil.add(mv1, mv2);
        VectorUtil.add(vcv1, vcv2);
        VectorUtil.add(cv1, mv2);
    }
}
