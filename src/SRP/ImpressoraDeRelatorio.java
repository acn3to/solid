package SRP;

import java.io.PrintStream;

public class ImpressoraDeRelatorio {
    private PrintStream printStream;

    public ImpressoraDeRelatorio(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void imprimir(String relatorio) {
        printStream.println(relatorio);
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public String toString() {
        return "ImpressoraDeRelatorio{" +
                "printStream=" + getPrintStream() +
                '}';
    }
}
