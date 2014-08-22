package com.fincatto.nfe.classes;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.validadores.IntegerValidador;
import com.fincatto.nfe.validadores.StringValidador;

public class NFEndereco extends NFBase {

    @Element(name = "xLgr", required = true)
    private String logradouro;

    @Element(name = "nro", required = true)
    private String numero;

    @Element(name = "xCpl", required = false)
    private String complemento;

    @Element(name = "xBairro", required = true)
    private String bairro;

    @Element(name = "cMun", required = true)
    private Integer codigoMunicipio;

    @Element(name = "xMun", required = true)
    private String descricaoMunicipio;

    @Element(name = "UF", required = true)
    private String uf;

    @Element(name = "CEP", required = true)
    private String cep;

    @Element(name = "cPais", required = false)
    private Integer codigoPais;

    @Element(name = "xPais", required = false)
    private String descricaoPais;

    @Element(name = "fone", required = false)
    private String telefone;

    public void setLogradouro(final String logradouro) {
        StringValidador.tamanho60(logradouro);
        this.logradouro = logradouro;
    }

    public void setNumero(final String numero) {
        StringValidador.tamanho60(numero);
        this.numero = numero;
    }

    public void setComplemento(final String complemento) {
        StringValidador.tamanho60(complemento);
        this.complemento = complemento;
    }

    public void setBairro(final String bairro) {
        StringValidador.tamanho60(bairro);
        this.bairro = bairro;
    }

    public void setCodigoMunicipio(final Integer codigoMunicipio) {
        IntegerValidador.exatamente7(codigoMunicipio);
        this.codigoMunicipio = codigoMunicipio;
    }

    public void setDescricaoMunicipio(final String descricaoMunicipio) {
        StringValidador.tamanho60(descricaoMunicipio);
        this.descricaoMunicipio = descricaoMunicipio;
    }

    public void setUf(final NFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }

    public void setCep(final String cep) {
        StringValidador.exatamente8(cep);
        this.cep = cep;
    }

    public void setCodigoPais(final Integer codigoPais) {
        IntegerValidador.tamanho2a4(codigoPais);
        this.codigoPais = codigoPais;
    }

    public void setDescricaoPais(final String descricaoPais) {
        StringValidador.tamanho60(descricaoPais);
        this.descricaoPais = descricaoPais;
    }

    public void setTelefone(final String telefone) {
        StringValidador.telefone(telefone);
        this.telefone = telefone;
    }
}