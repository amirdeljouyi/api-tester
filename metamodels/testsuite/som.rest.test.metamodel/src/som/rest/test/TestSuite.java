/**
 */
package som.rest.test;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.TestSuite#getDescription <em>Description</em>}</li>
 *   <li>{@link som.rest.test.TestSuite#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link som.rest.test.TestSuite#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see som.rest.test.TestPackage#getTestSuite_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link som.rest.test.TestSuite#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link som.rest.test.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see som.rest.test.TestPackage#getTestSuite_TestCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

	/**
	 * Returns the value of the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' attribute.
	 * @see #setApi(String)
	 * @see som.rest.test.TestPackage#getTestSuite_Api()
	 * @model
	 * @generated
	 */
	String getApi();

	/**
	 * Sets the value of the '{@link som.rest.test.TestSuite#getApi <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' attribute.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(String value);

} // TestSuite
