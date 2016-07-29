package br.com.christiano.rest.model.domain;

public enum NotaAtendimentoEnum {
	
	Excelente("Excelente"),
	Otimo("Otimo"),
    Bom("Bom"),
    Ruim("Ruim");
    
    private final String label;
    
    private NotaAtendimentoEnum(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return this.label;
    }

}
