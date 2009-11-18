/*
 * Copyright (c) 2009, Jean-Fran�ois Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.filesystem.diagram.parsers;

import java.util.Arrays;

import jfb.examples.gmf.filesystem.diagram.part.FilesystemDiagramEditorPlugin;
import jfb.examples.gmf.filesystem.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.osgi.util.NLS;

/**
 * @generated
 */
public abstract class AbstractParser implements IParser {

	/**
	 * @generated
	 */
	protected final EAttribute[] features;

	/**
	 * @generated
	 */
	protected final EAttribute[] editableFeatures;

	/**
	 * @generated
	 */
	private String viewPattern;

	/**
	 * @generated
	 */
	private String editorPattern;

	/**
	 * @generated
	 */
	private String editPattern;

	/**
	 * @generated
	 */
	public AbstractParser(EAttribute[] features) {
		if (features == null || Arrays.asList(features).contains(null)) {
			throw new IllegalArgumentException();
		}
		this.editableFeatures = this.features = features;
	}

	/**
	 * @generated
	 */
	public AbstractParser(EAttribute[] features, EAttribute[] editableFeatures) {
		if (features == null || Arrays.asList(features).contains(null)) {
			throw new IllegalArgumentException();
		}
		this.features = features;
		if (editableFeatures == null
				|| Arrays.asList(editableFeatures).contains(null)) {
			throw new IllegalArgumentException();
		}
		this.editableFeatures = editableFeatures;
	}

	/**
	 * @generated
	 */
	public String getViewPattern() {
		return viewPattern;
	}

	/**
	 * @generated
	 */
	public void setViewPattern(String viewPattern) {
		this.viewPattern = viewPattern;
	}

	/**
	 * @generated
	 */
	public String getEditorPattern() {
		return editorPattern;
	}

	/**
	 * @generated
	 */
	public void setEditorPattern(String editorPattern) {
		this.editorPattern = editorPattern;
	}

	/**
	 * @generated
	 */
	public String getEditPattern() {
		return editPattern;
	}

	/**
	 * @generated
	 */
	public void setEditPattern(String editPattern) {
		this.editPattern = editPattern;
	}

	/**
	 * @generated
	 */
	public boolean isAffectingEvent(Object event, int flags) {
		if (event instanceof Notification) {
			return isAffectingFeature(((Notification) event).getFeature());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean isAffectingFeature(Object feature) {
		for (int i = 0; i < features.length; i++) {
			if (features[i] == feature) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Object[] getValues(EObject element) {
		Object[] values = new Object[features.length];
		for (int i = 0; i < features.length; i++) {
			values[i] = getValue(element, features[i]);
		}
		return values;
	}

	/**
	 * @generated
	 */
	protected Object[] getEditableValues(EObject element) {
		Object[] values = new Object[editableFeatures.length];
		for (int i = 0; i < editableFeatures.length; i++) {
			values[i] = getValue(element, editableFeatures[i]);
		}
		return values;
	}

	/**
	 * @generated
	 */
	protected Object getValue(EObject element, EAttribute feature) {
		Object value = element.eGet(feature);
		Class iClass = feature.getEAttributeType().getInstanceClass();
		if (String.class.equals(iClass)) {
			if (value == null) {
				value = ""; //$NON-NLS-1$
			}
		}
		return value;
	}

	/**
	 * @generated
	 */
	protected ICommand getParseCommand(IAdaptable adapter, Object[] values,
			int flags) {
		if (values == null
				|| validateNewValues(values).getCode() != IParserEditStatus.EDITABLE) {
			return UnexecutableCommand.INSTANCE;
		}
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(element);
		if (editingDomain == null) {
			return UnexecutableCommand.INSTANCE;
		}
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(
				editingDomain, "Set Values"); //$NON-NLS-1$
		for (int i = 0; i < values.length; i++) {
			command.compose(getModificationCommand(element,
					editableFeatures[i], values[i]));
		}
		return command;
	}

	/**
	 * @generated
	 */
	protected ICommand getModificationCommand(EObject element,
			EAttribute feature, Object value) {
		value = getValidNewValue(feature, value);
		if (value instanceof InvalidValue) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest request = new SetRequest(element, feature, value);
		return new SetValueCommand(request);
	}

	/**
	 * @generated
	 */
	protected IParserEditStatus validateNewValues(Object[] values) {
		if (values.length != editableFeatures.length) {
			return ParserEditStatus.UNEDITABLE_STATUS;
		}
		for (int i = 0; i < values.length; i++) {
			Object value = getValidNewValue(editableFeatures[i], values[i]);
			if (value instanceof InvalidValue) {
				return new ParserEditStatus(FilesystemDiagramEditorPlugin.ID,
						IParserEditStatus.UNEDITABLE, value.toString());
			}
		}
		return ParserEditStatus.EDITABLE_STATUS;
	}

	/**
	 * @generated
	 */
	protected Object getValidNewValue(EAttribute feature, Object value) {
		EClassifier type = feature.getEType();
		if (type instanceof EDataType) {
			Class iClass = type.getInstanceClass();
			if (Boolean.TYPE.equals(iClass)) {
				if (value instanceof Boolean) {
					// ok
				} else if (value instanceof String) {
					value = Boolean.valueOf((String) value);
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Character.TYPE.equals(iClass)) {
				if (value instanceof Character) {
					// ok
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						value = new Character(s.charAt(0));
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Byte.TYPE.equals(iClass)) {
				if (value instanceof Byte) {
					// ok
				} else if (value instanceof Number) {
					value = new Byte(((Number) value).byteValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Byte.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Short.TYPE.equals(iClass)) {
				if (value instanceof Short) {
					// ok
				} else if (value instanceof Number) {
					value = new Short(((Number) value).shortValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Short.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Integer.TYPE.equals(iClass)) {
				if (value instanceof Integer) {
					// ok
				} else if (value instanceof Number) {
					value = new Integer(((Number) value).intValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Integer.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Long.TYPE.equals(iClass)) {
				if (value instanceof Long) {
					// ok
				} else if (value instanceof Number) {
					value = new Long(((Number) value).longValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Long.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Float.TYPE.equals(iClass)) {
				if (value instanceof Float) {
					// ok
				} else if (value instanceof Number) {
					value = new Float(((Number) value).floatValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Float.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (Double.TYPE.equals(iClass)) {
				if (value instanceof Double) {
					// ok
				} else if (value instanceof Number) {
					value = new Double(((Number) value).doubleValue());
				} else if (value instanceof String) {
					String s = (String) value;
					if (s.length() == 0) {
						value = null;
					} else {
						try {
							value = Double.valueOf(s);
						} catch (NumberFormatException nfe) {
							value = new InvalidValue(
									NLS
											.bind(
													Messages.AbstractParser_WrongStringConversion,
													iClass.getName()));
						}
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType, iClass
									.getName()));
				}
			} else if (type instanceof EEnum) {
				if (value instanceof String) {
					EEnumLiteral literal = ((EEnum) type)
							.getEEnumLiteralByLiteral((String) value);
					if (literal == null) {
						value = new InvalidValue(NLS.bind(
								Messages.AbstractParser_UnknownLiteral, value));
					} else {
						value = literal.getInstance();
					}
				} else {
					value = new InvalidValue(NLS.bind(
							Messages.AbstractParser_UnexpectedValueType,
							String.class.getName()));
				}
			}
		}
		return value;
	}

	/**
	 * @generated
	 */
	protected class InvalidValue {

		/**
		 * @generated
		 */
		private String description;

		/**
		 * @generated
		 */
		public InvalidValue(String description) {
			this.description = description;
		}

		/**
		 * @generated
		 */
		public String toString() {
			return description;
		}
	}
}
