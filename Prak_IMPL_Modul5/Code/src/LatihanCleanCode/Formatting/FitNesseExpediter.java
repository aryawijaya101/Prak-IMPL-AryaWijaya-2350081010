package LatihanCleanCode.Formatting;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FitNesseExpediter implements ResponseSender {

    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Response response;
    private FitNesseContext context;
    protected long requestParsingTimeLimit;
    private long requestProgress;
    private long requestParsingDeadline;
    private boolean hasError;

    public FitNesseExpediter(Socket socket, InputStream input, OutputStream output,
                             Request request, Response response, FitNesseContext context) {
        this.socket = socket;
        this.input = input;
        this.output = output;
        this.request = request;
        this.response = response;
        this.context = context;
    }

    @Override
    public void sendResponse() {
        // Implement logic to send the response
        System.out.println("Sending response...");
    }

    public boolean hasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public long getRequestParsingTimeLimit() {
        return requestParsingTimeLimit;
    }

    public void setRequestParsingTimeLimit(long requestParsingTimeLimit) {
        this.requestParsingTimeLimit = requestParsingTimeLimit;
    }

    public long getRequestProgress() {
        return requestProgress;
    }

    public void setRequestProgress(long requestProgress) {
        this.requestProgress = requestProgress;
    }

    public long getRequestParsingDeadline() {
        return requestParsingDeadline;
    }

    public void setRequestParsingDeadline(long requestParsingDeadline) {
        this.requestParsingDeadline = requestParsingDeadline;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public InputStream getInput() {
        return input;
    }

    public void setInput(InputStream input) {
        this.input = input;
    }

    public OutputStream getOutput() {
        return output;
    }

    public void setOutput(OutputStream output) {
        this.output = output;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public FitNesseContext getContext() {
        return context;
    }

    public void setContext(FitNesseContext context) {
        this.context = context;
    }
}
