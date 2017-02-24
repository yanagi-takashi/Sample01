package org.jboss.tools.examples.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.tools.examples.model.CodeMst;

@RequestScoped
public class CodeMstListProducer {

    @Inject
    private CodeMstRepository codemstRepository;

    private List<CodeMst> codemst;

    // @Named provides access the return value via the EL variable name "members" in the UI (e.g.
    // Facelets or JSP view)
    @Produces
    @Named
    public List<CodeMst> getCodeMst() {
        return codemst;
    }

    public void onCodeListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final CodeMst codemst) {
        retrieveAllCodeMstOrderedByName();
    }

    @PostConstruct
    public void retrieveAllCodeMstOrderedByName() {
    //    codemst = codemstRepository.findAllOrderedByName();
    	  codemst = codemstRepository.findAll();
    }
}
