package com.fincatto.nfe.classes.nota;

public enum NFNotaInfoSituacaoTributariaCOFINS {
    OPERACAO_TRIBUTAVEL_CUMULATIVO_NAO_CUMULATIVO("01"),
    OPERACAO_TRIBUTAVEL_ALIQUOTA_DIFERENCIADA("02"),
    OPERACAO_TRIBUTAVEL_QUANTIDADE_VENDIDA_POR_ALIQUOTA_POR_UNIDADE_PRODUTO("03"),
    OPERACAO_TRIBUTAVEL_MONOFASICA_ALIQUOTA_ZERO("04"),
    OPERACAO_TRIBUTAVEL_ALIQUOTA_ZERO("06"),
    OPERACAO_ISENTA_CONTRIBUICAO("07"),
    OPERACAO_SEM_INCIDENCIA_CONTRIBUICAO("08"),
    OPERACAO_COM_SUSPENSAO_CONTRIBUICAO("09"),
    OUTRAS_OPERACOES_SAIDA("49"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_EXCLUSIVAMENTE_RECEITA_TRIBUTADA_MERCADO_INTERNO("50"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_EXCLUSIVAMENTE_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO("51"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_EXCLUSIVAMENTE_RECEITA_EXPORTACAO("52"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_RECEITAS_TRIBUTADA_E_NAO_TRIBUTADA_MERCADO_INTERNO("53"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_RECEITAS_TRIBUTADAS_NO_MERCADO_INTERNO_EXPORTACAO("54"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_RECEITAS_NAO_TRIBUTADA_NO_MERCADO_INTERNO_EXPORTACAO("55"),
    OPERACAO_DIREITO_CREDITO_VINCULADA_RECEITAS_TRIBUTADAS_E_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO("56"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_RECEITA_TRIBUTADA_MERCADO_INTERNO("60"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_A_RECEITA_NAO_TRIBUTADA_MERCADO_INTERNO("61"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_EXCLUSIVAMENTE_RECEITA_EXPORTACAO("62"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_TRIBUTADAS_E_NAO_TRIBUTADAS_MERCADO_INTERNO("63"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_TRIBUTADA_MERCADO_INTERNO_EXPORTACAO("64"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO("65"),
    CREDITO_PRESUMIDO_OPERACAO_AQUISICAO_VINCULADA_RECEITAS_TRIBUTADAS_E_NAO_TRIBUTADAS_MERCADO_INTERNO_EXPORTACAO("66"),
    CREDITO_PRESUMIDO_OUTRAS("67"),
    OPERACAO_AQUISICAO_SEM_DIREITO_CREDITO("70"),
    OPERACAO_AQUISICAO_COM_ISENCAO("71"),
    OPERACAO_AQUISICAO_COM_SUSPENSAO("72"),
    OPERACAO_AQUISICAO_ALIQUOTA_ZERO("73"),
    OPERACAO_AQUISICAO_SEM_INCIDENCIA_CONTRIBUICAO("74"),
    OPERACAO_AQUISICAO_SUBSTITUICAO_TRIBUTARIA("75"),
    OUTRAS_OPERACOES_ENTRADA("98"),
    OUTRAS_OPERACOES("99");

    private String codigo;

    private NFNotaInfoSituacaoTributariaCOFINS(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NFNotaInfoSituacaoTributariaCOFINS valueOfCodigo(final String codigo) {
        for (final NFNotaInfoSituacaoTributariaCOFINS situacaoTributariaCOFINS : NFNotaInfoSituacaoTributariaCOFINS.values()) {
            if (situacaoTributariaCOFINS.getCodigo().equals(codigo)) {
                return situacaoTributariaCOFINS;
            }
        }
        return null;
    }
}