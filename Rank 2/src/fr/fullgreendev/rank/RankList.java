package fr.fullgreendev.rank;



public enum RankList{

	/**
	 * Liste des Grades.
	 */
	ADMINISTRATOR(0, 100, "§4[Admin] ", "", " §8§l>> §4"),
	RESPONSABLE(1, 95, "§6[Resp] ", "", " §8§l>> §6"),
	COMMUNITY(2, 94, "§c[Community] ", "", " §8§l>> §c"),
	RESPMODO(3, 91, "§6[RespModo] ", "", " §6§l>> §6"),
	RESPHOST(4, 91, "§6[RespHost] ", "", " §6§l>> §6"),
	RESPBUILDER(5,91, "§6[RespBuilder] ", "", " §6§l>> §6"),
	RESPDEV(6,91, "§6[RespDev] ", "", " §6§l>> §6"),
	HEBERGEUR(7,89, "§2[Hebergeur] ", "", " §2§l>> §2"),
	DEV(8, 99, "§a[Developpeur] ", "", " §a§l>> §a"),
	HOST(9, 87, "§5[Host] ", "", " §5§l>> §5"),
	SUPMODO(10,86, "§1[Super-Modo] ", "", " §1§l>> §1"),
	MODERATOR(11, 85, "§9[Modo] ", "", " §9§l>> §9"),
	BUILDER(12,84, "§e[Builder] ", "", " §e§l>> §e"),
	GRAPHISTE(13,83, "§f[Graphiste] ", "", " §f§l>> §f"),
	HELPER(14, 70, "§b[Assistant] ", "", " §b§l>> §b"),
	PARTENAIRE(14, 70, "§3[Partenaire] ", "", " §b§l>> §3"),
	HPARTY(15,30, "§a[H.PARTY'S] ", "", " §a§l>> §a"),
	ELITE(16,20, "§2[Elite] ", "", " §2§l>> §a"),
	PLAYER(17, 10, "§7 ", "", " >> ");
	
	/**
	 * power est la puissance/permission d'un Grade.
	 * id est la valeur unique d'un Grade
	 */
	private final int power, id;
	
	/**
	 * prefix est le String avant le pseudo du joueur.
	 * suffix est le String après le pseudo du joueur.
	 * chatSeparator est ce qui sépare le Pseudo et le message dans le Tchat.
	 */
	private final String prefix, suffix, chatSeparator;
	
	/**
	 * Seul constructeur qui permet d'initialiser les fields.
	 * 
	 * @param id Valeur unique d'un Grade.
	 * @param power Puissance/Permission d'un Grade. 
	 * @param prefix String affiché avant le pseudo du joueur.
	 * @param suffix String affiché après le pseudo du joueur.
	 * @param chatSeparator String qui sépare le pseudo du joueur et le message dans le tchat.
	 */
	private RankList(int id, int power, String prefix, String suffix, String chatSeparator){
		this.id = id;
		this.power = power;
		this.prefix = prefix;
		this.suffix = suffix;
		this.chatSeparator = chatSeparator;
	}
	
	/**
	 * Getter de l'id du grade.
	 * @return id
	 */
	public final int getId(){
		return id;
	}
	
	/**
	 * Getter du power du grade.
	 * @return power
	 */
	public final int getPower(){
		return power;
	}
	
	/**
	 * Getter du prefix du grade.
	 * @return prefix
	 */
	public final String getPrefix() {
		return prefix;
	}

	/**
	 * Getter du suffix du grade.
	 * @return suffix
	 */
	public final String getSuffix() {
		return suffix;
	}
	
	/**
	 * Getter de nom du grade.
	 * @return toString()
	 */
	public final String getName(){
		return this.toString();
	}

	/**
	 * Getter du chatSeparator du grade.
	 * @return chatSeparator
	 */
	public final String getChatSeparator() {
		return chatSeparator;
	}
}