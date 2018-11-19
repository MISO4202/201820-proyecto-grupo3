/**
 */
package blockchain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operador Logico</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage#getOperadorLogico()
 * @model
 * @generated
 */
public enum OperadorLogico implements Enumerator {
	/**
	 * The '<em><b>IGUAL IGUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGUAL_IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	IGUAL_IGUAL(0, "IGUAL_IGUAL", "=="),

	/**
	 * The '<em><b>DIFERENTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFERENTE(1, "DIFERENTE", "!="),

	/**
	 * The '<em><b>MAYORQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYORQUE_VALUE
	 * @generated
	 * @ordered
	 */
	MAYORQUE(2, "MAYORQUE", ">"),

	/**
	 * The '<em><b>MENORQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENORQUE_VALUE
	 * @generated
	 * @ordered
	 */
	MENORQUE(3, "MENORQUE", "<"),

	/**
	 * The '<em><b>MAYORIGUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYORIGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAYORIGUAL(4, "MAYORIGUAL", ">="),

	/**
	 * The '<em><b>MENORIGUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENORIGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MENORIGUAL(5, "MENORIGUAL", "<="),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(7, "AND", "&&"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(8, "OR", "||");

	/**
	 * The '<em><b>IGUAL IGUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IGUAL IGUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGUAL_IGUAL
	 * @model literal="=="
	 * @generated
	 * @ordered
	 */
	public static final int IGUAL_IGUAL_VALUE = 0;

	/**
	 * The '<em><b>DIFERENTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIFERENTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE
	 * @model literal="!="
	 * @generated
	 * @ordered
	 */
	public static final int DIFERENTE_VALUE = 1;

	/**
	 * The '<em><b>MAYORQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAYORQUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYORQUE
	 * @model literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int MAYORQUE_VALUE = 2;

	/**
	 * The '<em><b>MENORQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENORQUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENORQUE
	 * @model literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int MENORQUE_VALUE = 3;

	/**
	 * The '<em><b>MAYORIGUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAYORIGUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYORIGUAL
	 * @model literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int MAYORIGUAL_VALUE = 4;

	/**
	 * The '<em><b>MENORIGUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENORIGUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENORIGUAL
	 * @model literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int MENORIGUAL_VALUE = 5;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model literal="&amp;&amp;"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 7;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model literal="||"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Operador Logico</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperadorLogico[] VALUES_ARRAY =
		new OperadorLogico[] {
			IGUAL_IGUAL,
			DIFERENTE,
			MAYORQUE,
			MENORQUE,
			MAYORIGUAL,
			MENORIGUAL,
			AND,
			OR,
		};

	/**
	 * A public read-only list of all the '<em><b>Operador Logico</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperadorLogico> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operador Logico</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperadorLogico get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperadorLogico result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operador Logico</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperadorLogico getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperadorLogico result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operador Logico</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperadorLogico get(int value) {
		switch (value) {
			case IGUAL_IGUAL_VALUE: return IGUAL_IGUAL;
			case DIFERENTE_VALUE: return DIFERENTE;
			case MAYORQUE_VALUE: return MAYORQUE;
			case MENORQUE_VALUE: return MENORQUE;
			case MAYORIGUAL_VALUE: return MAYORIGUAL;
			case MENORIGUAL_VALUE: return MENORIGUAL;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperadorLogico(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OperadorLogico
