import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class Methods {
    private String methodName;
    private boolean isWritten;

    public Methods(String methodName) {
        this.methodName = methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setWritten(boolean written) {
        isWritten = written;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean isWritten() {
        return isWritten;
    }
}
