import dominio.FuncionarioMensalista;

public class Principal {

    public static void main(String[] args) {

//        dominio.Funcionario f = new dominio.Funcionario();
//        f.setNome("Silas");
//        f.setCpf("341.223.960-77");
//
//        if (f.validarCPF()) {
//            System.out.println("CPF é Válido");
//        } else {
//            System.out.println("CPF NÃO é Válido");
//        }

        FuncionarioMensalista fm = new FuncionarioMensalista();
        fm.setNome("João Victor");
        fm.setCpf("818.018.050-67");
        fm.setSalario(19800.0);
        fm.setComissao(4000.0);

        if (fm.validarCPF()) {
            System.out.println("CPF é Válido");
        } else {
            System.out.println("CPF NÃO é Válido");
        }

    }

}
