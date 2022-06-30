
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizarTabela(){
        //Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamento = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamento.selectAll();
        
        helper.preecherTabela(agendamentos);
    }
    
   
   

    public void atualizaCliente() {
        //buscar clientes do banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico() {
        //buscar clientes do banco de dados
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //exibir clientes no combobox cliente
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        //buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        //salvar objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        //inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
        
    }
    
    
}
