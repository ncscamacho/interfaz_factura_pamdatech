package com.pandatech.starter.bean;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Model
public class FileuploadMB {

    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void carga_p12(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Archivo p12 cargado: ", event.getFile().getFileName() + " . Tamano (KB): "+event.getFile().getSize()/1024f);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void Carga_xml(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Archivo xml cargado: ", event.getFile().getFileName() + " . Tamano (KB): "+event.getFile().getSize()/1024f);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
    
}
