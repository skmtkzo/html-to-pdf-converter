package te.htmltopdf.domain.exceptions;

import org.apache.commons.exec.DefaultExecutor;
import te.htmltopdf.HtmlPumpStreamHandler;

import java.io.IOException;

public class HtmlToPdfConversionException extends IOException {

    public HtmlToPdfConversionException(DefaultExecutor executor, Throwable throwable) {
        this(
                ((HtmlPumpStreamHandler) executor.getStreamHandler()).getOutputTextFromBinary(),
                throwable
        );
    }

    public HtmlToPdfConversionException(String wkhtmlToPdfOutputText, Throwable throwable) {
        super("HTML -> PDF conversion failed!\nOutput of wkhtmltopdf binary:\n" + wkhtmlToPdfOutputText, throwable);
    }

}
