package br.com.renanweb.model;

public class Refeicao {
	private int id_refeicao;
	private int usuario_id;
	private String refeicao_manha;
	private String refeicao_tarde;
	private String refeicao_noite;
	private Usuarios usuarios;
	
	public int getId_refeicao() {
		return id_refeicao;
	}
	public void setId_refeicao(int id_refeicao) {
		this.id_refeicao = id_refeicao;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getRefeicao_manha() {
		return refeicao_manha;
	}
	public void setRefeicao_manha(String refeicao_manha) {
		this.refeicao_manha = refeicao_manha;
	}
	public String getRefeicao_tarde() {
		return refeicao_tarde;
	}
	public void setRefeicao_tarde(String refeicao_tarde) {
		this.refeicao_tarde = refeicao_tarde;
	}
	public String getRefeicao_noite() {
		return refeicao_noite;
	}
	public void setRefeicao_noite(String refeicao_noite) {
		this.refeicao_noite = refeicao_noite;
	}
	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Refeicao{" +
				"id_refeicao=" + id_refeicao +
				", usuario_id=" + usuario_id +
				", refeicao_manha='" + refeicao_manha + '\'' +
				", refeicao_tarde='" + refeicao_tarde + '\'' +
				", refeicao_noite='" + refeicao_noite + '\'' +
				", usuarios=" + usuarios +
				'}';
	}
}
