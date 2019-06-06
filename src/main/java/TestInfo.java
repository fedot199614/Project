
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class TestInfo {
    private int methodCount;
    private List<Methods> methodNames;
    private String className;

    public TestInfo(int methodCount, List<Methods> methodNames, String className) {
        this.methodCount = methodCount;
        this.methodNames = methodNames;
        this.className = className;
    }

    public int getMethodCount() {
        return methodCount;
    }

    public List<Methods> getMethodNames() {
        return methodNames;
    }

    public String getClassName() {
        return className;
    }

    public void setMethodCount(int methodCount) {
        this.methodCount = methodCount;
    }

    public void setMethodNames(List<Methods> methodNames) {
        this.methodNames = methodNames;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
                "methodCount=" + methodCount +
                ", methodNames=" + methodNames +
                ", className='" + className + '\'' +
                '}';
    }

}
