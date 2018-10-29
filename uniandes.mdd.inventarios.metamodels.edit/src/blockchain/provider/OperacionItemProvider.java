/**
 */
package blockchain.provider;


import blockchain.BlockchainFactory;
import blockchain.BlockchainPackage;
import blockchain.Operacion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockchain.Operacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperacionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addEsUserDefinedPropertyDescriptor(object);
			addRetornoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_name_feature", "_UI_Operacion_type"),
				 BlockchainPackage.Literals.OPERACION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Es User Defined feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsUserDefinedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_esUserDefined_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_esUserDefined_feature", "_UI_Operacion_type"),
				 BlockchainPackage.Literals.OPERACION__ES_USER_DEFINED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retorno feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetornoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operacion_retorno_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operacion_retorno_feature", "_UI_Operacion_type"),
				 BlockchainPackage.Literals.OPERACION__RETORNO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BlockchainPackage.Literals.OPERACION__PARAMETROS);
			childrenFeatures.add(BlockchainPackage.Literals.OPERACION__SENTENCIA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Operacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operacion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Operacion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Operacion_type") :
			getString("_UI_Operacion_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operacion.class)) {
			case BlockchainPackage.OPERACION__NAME:
			case BlockchainPackage.OPERACION__ES_USER_DEFINED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BlockchainPackage.OPERACION__PARAMETROS:
			case BlockchainPackage.OPERACION__SENTENCIA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__PARAMETROS,
				 BlockchainFactory.eINSTANCE.createParametro()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createParametro()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createEstado()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionLogica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionAritmetica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createCondicional()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionNumerica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionTexto()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionReferenciada()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.OPERACION__SENTENCIA,
				 BlockchainFactory.eINSTANCE.createExpresionRelacional()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BlockchainPackage.Literals.OPERACION__PARAMETROS ||
			childFeature == BlockchainPackage.Literals.OPERACION__SENTENCIA;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BlockchainEditPlugin.INSTANCE;
	}

}
