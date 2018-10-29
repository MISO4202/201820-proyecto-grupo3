/**
 */
package blockchain.provider;


import blockchain.BlockchainFactory;
import blockchain.BlockchainPackage;
import blockchain.Condicional;
import blockchain.TipoCondicion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockchain.Condicional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CondicionalItemProvider extends SentenciaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CondicionalItemProvider(AdapterFactory adapterFactory) {
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

			addTipoCondicionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tipo Condicional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoCondicionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Condicional_tipoCondicional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Condicional_tipoCondicional_feature", "_UI_Condicional_type"),
				 BlockchainPackage.Literals.CONDICIONAL__TIPO_CONDICIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(BlockchainPackage.Literals.CONDICIONAL__EXPRESIONLOGICA);
			childrenFeatures.add(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS);
			childrenFeatures.add(BlockchainPackage.Literals.CONDICIONAL__ELSE);
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
	 * This returns Condicional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condicional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TipoCondicion labelValue = ((Condicional)object).getTipoCondicional();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Condicional_type") :
			getString("_UI_Condicional_type") + " " + label;
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

		switch (notification.getFeatureID(Condicional.class)) {
			case BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
			case BlockchainPackage.CONDICIONAL__SENTENCIAS:
			case BlockchainPackage.CONDICIONAL__ELSE:
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
				(BlockchainPackage.Literals.CONDICIONAL__EXPRESIONLOGICA,
				 BlockchainFactory.eINSTANCE.createExpresionLogica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createParametro()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createEstado()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionLogica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionAritmetica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createCondicional()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionNumerica()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionTexto()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionReferenciada()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS,
				 BlockchainFactory.eINSTANCE.createExpresionRelacional()));

		newChildDescriptors.add
			(createChildParameter
				(BlockchainPackage.Literals.CONDICIONAL__ELSE,
				 BlockchainFactory.eINSTANCE.createCondicional()));
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
			childFeature == BlockchainPackage.Literals.CONDICIONAL__EXPRESIONLOGICA ||
			childFeature == BlockchainPackage.Literals.CONDICIONAL__SENTENCIAS ||
			childFeature == BlockchainPackage.Literals.CONDICIONAL__ELSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
