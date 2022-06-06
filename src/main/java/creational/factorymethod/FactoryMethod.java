package creational.factorymethod;

public class FactoryMethod {

    public ImageReader getReader(String format) {
        if (format == null) {
            return null;
        }
        if (format.equals("gif")) {
            return new GifReader(format);
        }
        if (format.equals("jpeg")) {
            return new JpegReader(format);
        } else {
            throw new IllegalArgumentException("Unknown format " + format);
        }
    }
}