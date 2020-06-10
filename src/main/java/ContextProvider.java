import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class ContextProvider extends TemplateContextType {
    protected ContextProvider() {
        super("GOLANG", "Golang");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile psiFile, int i) {
        return psiFile.getName().endsWith(".go");
    }
}
