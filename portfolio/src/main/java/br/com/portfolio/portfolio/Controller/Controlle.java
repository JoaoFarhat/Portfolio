package br.com.portfolio.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.portfolio.portfolio.Model.Experiencias;
import br.com.portfolio.portfolio.Model.Linguagens;
import br.com.portfolio.portfolio.Model.Pessoa;

@Controller
@RequestMapping("/exemplo")
public class Controlle {

    Pessoa p = new Pessoa("João",
    "Farhat",
    "Me Chamo João Victor Farhat Calejon, nascido em 30 de Abril de 2004, morador da cidade de São Paulo.",
    "Atualmente estou cursando Tecnólogo em Análise e Desenvolvimento de Sistemas no Senac, procuro atuar como Desenvolvedor Júnior.",
    "Estou sempre me dedicando a aprender as diversas linguagens e softwares, e sempre me atualizar sobre este mundo de tecnologia que só vem crescendo.",
    "Estou a procura de oportunidades onde eu possa agregar positivamente para a empresa em todas as atividades nas diferentes áreas.",
    "Estudante de Analise e Desenvolvimento de Sistemas",
    "Programador Back-End",
    "joaofarhat9@gmail.com",
    "+55 (11) 94498-0469");
    
    @GetMapping("/portfolio")
    public ModelAndView exemplo(){
        ModelAndView mv = new ModelAndView("portfolio");
        mv.addObject("logo", p.getSobrenome().toUpperCase());

        mv.addObject("nome", p.getNome());
        mv.addObject("sobrenome", p.getSobrenome());
        mv.addObject("resumo", p.getResumo());
        mv.addObject("profissao", p.getProfissao());
        mv.addObject("email", p.getEmail());
        mv.addObject("telefone", p.getTelefone());

        mv.addObject("sobre1", p.getSobre1());
        mv.addObject("sobre2", p.getSobre2());
        mv.addObject("sobre3", p.getSobre3());
        mv.addObject("sobre4", p.getSobre4());

        Linguagens J = new Linguagens("Java", 63);
        mv.addObject("java", J.getNome());
        mv.addObject("javaP", J.getConhecimento() + "%");

        Linguagens HT = new Linguagens("HTML/CSS", 82);
        mv.addObject("html", HT.getNome());
        mv.addObject("htmlP", HT.getConhecimento() + "%");

        Linguagens SQL = new Linguagens("MySQL", 51);
        mv.addObject("sql", SQL.getNome());
        mv.addObject("sqlP", SQL.getConhecimento() + "%");

        Linguagens IOS = new Linguagens("Swift", 58);
        mv.addObject("ios", IOS.getNome());
        mv.addObject("iosP", IOS.getConhecimento() + "%");
        
        Linguagens ING = new Linguagens("Inglês", 64);
        mv.addObject("ing", ING.getNome());
        mv.addObject("ingP", ING.getConhecimento() + "%");

        Linguagens ESP = new Linguagens("Espanhol", 33);
        mv.addObject("esp", ESP.getNome());
        mv.addObject("espP", ESP.getConhecimento() + "%");

        Experiencias ETEC = new Experiencias(2018,
        2021,
        "ETEC Carolina Carinhato Sampaio",
        "Ensino Médio",
        "Foi aqui que estudei os 3 anos do Ensino Médio, onde me ajudou muito a conseguir trabalhar em grupo, ter responsabilidades e a ir atrás de estudar o que for necessario.");

        mv.addObject("etecAno", ETEC.getAnoInicio() + " - " + ETEC.getAnoFinal());
        mv.addObject("etecNome", ETEC.getLugar() + " - " + ETEC.getCargo());
        mv.addObject("etecResumo", ETEC.getResumo());

        Experiencias FREI = new Experiencias(2019,
        2020,
        "Instituto Nacional Nossa Senhora de Fatima",
        "Técnico",
        "Comecei a conhecer o mundo da programação com linguagem C#, aprendi também banco de daos com MySQL e o basico do Desenvolvimento Web, e criei meu primeiro projeto.");

        mv.addObject("freiAno", FREI.getAnoInicio() + " - " + FREI.getAnoFinal());
        mv.addObject("freiNome", FREI.getLugar() + " - " + FREI.getCargo());
        mv.addObject("freiResumo", FREI.getResumo());

        Experiencias SENAC = new Experiencias(2022,
        2024,
        "Senac Nações Unidas",
        "Faculdade",
        "Após o ultimo curso, comecei a faculdade de Analise e Desenvolvimento de Sistemas, para continuar aprendendo, agora conhecendo novas linguagens como Java e Node.js, aprender mais sobre MySQL e Desenvolvimento Web.");

        mv.addObject("senacAno", SENAC.getAnoInicio() + " - " + SENAC.getAnoFinal());
        mv.addObject("senacNome", SENAC.getLugar() + " - " + SENAC.getCargo());
        mv.addObject("senacResumo", SENAC.getResumo());

        Experiencias GLDS = new Experiencias(2021,
        2021,
        "GLDS",
        "Auxiliar de Design",
        "Primeiro emprego foi como auxiliar de Desenvolvimento, criando sites a partir do Wordpress, copywriting e marketing digital");

        mv.addObject("gldsAno", GLDS.getAnoInicio() + " - " + GLDS.getAnoFinal());
        mv.addObject("gldsNome", GLDS.getLugar() + " - " + GLDS.getCargo());
        mv.addObject("gldsResumo", GLDS.getResumo());
        
        Experiencias MALEX = new Experiencias(2021,
        2022,
        "Malex do Brasil",
        "Auxiliar Ténico",
        "Auxiliava a manutenção de maquinas de moedas nos aeroportos de São Paulo, fazia atendimento ao cliente e também importação e exportação de produtos");

        mv.addObject("malexAno", MALEX.getAnoInicio() + " - " + MALEX.getAnoFinal());
        mv.addObject("malexNome", MALEX.getLugar() + " - " + MALEX.getCargo());
        mv.addObject("malexResumo", MALEX.getResumo());
        
        return mv;
    }
}
