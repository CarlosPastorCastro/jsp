/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jacinto
 */
public class Usuario {
    private String ip;
    private String code;
    
    public Usuario(String ip){
        this.ip = ip;
        this.code = "";
    }

    public String getIp() {
        return ip;
    }

    public String getCode() {
        return code;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
