package jfb.examples.gmf.school.ui.provider;

import jfb.examples.gmf.school.SchoolPackage;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class SchoolPropertySource extends PropertySource {

	public SchoolPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}
	
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
		SchoolPackage pkg = SchoolPackage.eINSTANCE;
		Object feature = itemPropertyDescriptor.getFeature(object);
		if (pkg.getStudent_Friends().equals(feature)) {
			return new StudentFriendsPropertyDescriptor(object, itemPropertyDescriptor);
		}
		// Other cases to handle ?
		// else if (pkg.get<AnotherFeature>().equals(feature)) {
		//	return myPropertyDescriptor(object, itemPropertyDescriptor); 
		// }
		// Else, default EMF behavior
		else {
			return super.createPropertyDescriptor(itemPropertyDescriptor);
		}
	}
	
}
